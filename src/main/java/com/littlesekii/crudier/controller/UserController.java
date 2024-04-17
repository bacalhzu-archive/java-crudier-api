package com.littlesekii.crudier.controller;

import com.littlesekii.crudier.model.dto.UserDTO;
import com.littlesekii.crudier.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<UserDTO>> findAll() {
        List<UserDTO> res = service.findAll();
        return ResponseEntity.ok().body(res);
    }

    @PostMapping
    public ResponseEntity<UserDTO> create(@RequestBody UserDTO req) {
        UserDTO res = service.save(req);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(res.id()).toUri();

        return ResponseEntity.created(location).body(res);
    }
}
