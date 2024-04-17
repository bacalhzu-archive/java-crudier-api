package com.littlesekii.crudier.model.dto;

import com.littlesekii.crudier.model.entity.UserEntity;

import java.util.UUID;

public record UserDTO(UUID id, String username, String name, Integer age, String favoriteThing, Boolean isDeveloper) {

    public UserEntity toUserEntity() {
        return new UserEntity(id, username, name, age, favoriteThing, isDeveloper);
    }
}
