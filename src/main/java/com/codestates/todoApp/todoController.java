package com.codestates.todoApp;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class todoController {


    @GetMapping("/")
    public ResponseEntity<String> todoHome() {
        return ResponseEntity.ok("To-do Application !");

    }
}
