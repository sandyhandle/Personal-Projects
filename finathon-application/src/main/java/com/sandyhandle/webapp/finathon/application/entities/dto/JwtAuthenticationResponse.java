package com.sandyhandle.webapp.finathon.application.entities.dto;

import lombok.Data;

@Data
public class JwtAuthenticationResponse {
    private String token;
    private String refreshToken;
}
