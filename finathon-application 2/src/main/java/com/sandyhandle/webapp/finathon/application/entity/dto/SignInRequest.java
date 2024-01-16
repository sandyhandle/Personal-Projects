package com.sandyhandle.webapp.finathon.application.entity.dto;

import lombok.Data;

@Data
public class SignInRequest {
    private String email;
    private String password;
}
