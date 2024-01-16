package com.sandyhandle.webapp.finathon.application.controllers;

import com.sandyhandle.webapp.finathon.application.entity.AppUser;
import com.sandyhandle.webapp.finathon.application.entity.dto.SignUpRequest;
import com.sandyhandle.webapp.finathon.application.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @GetMapping("/s")
    public ResponseEntity<String> s(){
        return ResponseEntity.ok("Working :)");
    }

    @PostMapping("/signup")
    public ResponseEntity<AppUser> signUp(@RequestBody SignUpRequest signUpRequest){
        return ResponseEntity.ok(authService.signUp(signUpRequest));
    }

    @PostMapping("/signin")
    public ResponseEntity<AppUser> signIn(@RequestBody SignUpRequest signUpRequest){
        return ResponseEntity.ok(authService.signUp(signUpRequest));
    }
}
