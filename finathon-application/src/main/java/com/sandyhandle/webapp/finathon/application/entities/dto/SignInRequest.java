package com.sandyhandle.webapp.finathon.application.entities.dto;

import lombok.Data;

@Data
public class SignInRequest {
    private String email;
    private String password;
}
