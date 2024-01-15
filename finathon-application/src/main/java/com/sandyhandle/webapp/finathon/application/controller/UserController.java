package com.sandyhandle.webapp.finathon.application.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class UserController {


    @GetMapping
    public ResponseEntity<String> user(){
        return  ResponseEntity.ok("Hi, My User..!");
    }
}
