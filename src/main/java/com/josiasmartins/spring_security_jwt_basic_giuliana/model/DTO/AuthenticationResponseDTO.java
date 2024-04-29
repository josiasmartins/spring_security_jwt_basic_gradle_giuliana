package com.josiasmartins.spring_security_jwt_basic_giuliana.model.DTO;

import lombok.Data;
import org.springframework.security.core.Authentication;

@Data
public class AuthenticationResponseDTO {

    private String token;

    public AuthenticationResponseDTO(String token) {
        this.token = token;
    }

}
