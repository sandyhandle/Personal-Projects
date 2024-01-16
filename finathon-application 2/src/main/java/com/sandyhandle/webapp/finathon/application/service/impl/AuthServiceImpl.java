package com.sandyhandle.webapp.finathon.application.service.impl;

import com.sandyhandle.webapp.finathon.application.entity.AppUser;
import com.sandyhandle.webapp.finathon.application.entity.UserRole;
import com.sandyhandle.webapp.finathon.application.entity.dto.SignUpRequest;
import com.sandyhandle.webapp.finathon.application.repository.UserRepository;
import com.sandyhandle.webapp.finathon.application.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final UserRepository userRepository;

    public AppUser signUp(SignUpRequest signUpRequest) {
        AppUser user = AppUser.builder()
                .name(signUpRequest.getName())
                .email(signUpRequest.getEmail())
                .password(signUpRequest.getPassword())
                .role(UserRole.USER)
                .build();
        userRepository.save(user);
        return user;
    }
}
