package com.sandyhandle.webapp.finathon.application.entities.dto;


import lombok.Data;

@Data
public class SignUpRequest {

    private String name;
    private String email;
    private String password;

}
