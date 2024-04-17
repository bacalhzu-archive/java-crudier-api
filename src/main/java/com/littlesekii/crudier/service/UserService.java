package com.littlesekii.crudier.service;

import com.littlesekii.crudier.model.dto.UserDTO;
import com.littlesekii.crudier.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public List<UserDTO> findAll() {
        List<UserDTO> res = new ArrayList<>();

        var data = repository.findAll();
        data.forEach(
            userEntity -> res.add(
                new UserDTO(
                    userEntity.getId(),
                    userEntity.getUsername(),
                    userEntity.getName(),
                    userEntity.getAge(),
                    userEntity.getFavoriteThing(),
                    userEntity.getIsDeveloper()
                )
            )
        );

        return res;
    }

    public UserDTO save(UserDTO req) {
        var data = repository.save(req.toUserEntity());

        return new UserDTO(
            data.getId(),
            data.getUsername(),
            data.getName(),
            data.getAge(),
            data.getFavoriteThing(),
            data.getIsDeveloper()
        );
    }
}
