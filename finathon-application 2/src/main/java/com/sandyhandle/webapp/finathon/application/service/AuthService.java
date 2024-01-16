package com.sandyhandle.webapp.finathon.application.service;


import com.sandyhandle.webapp.finathon.application.entity.AppUser;
import com.sandyhandle.webapp.finathon.application.entity.dto.SignUpRequest;

public interface AuthService {
    AppUser signUp(SignUpRequest signUpRequest);
}
