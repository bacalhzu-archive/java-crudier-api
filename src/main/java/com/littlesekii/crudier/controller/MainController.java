package com.littlesekii.crudier.controller;

import com.littlesekii.crudier.model.dto.MessageDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class MainController {

    @GetMapping("/ping")
    public ResponseEntity<MessageDTO> ping() {
        MessageDTO res = new MessageDTO("Pong! 🏓");
        return ResponseEntity.ok().body(res);
    }
}
