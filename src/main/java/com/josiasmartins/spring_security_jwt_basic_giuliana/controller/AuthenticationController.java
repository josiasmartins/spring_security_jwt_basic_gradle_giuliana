package com.josiasmartins.spring_security_jwt_basic_giuliana.controller;

import com.josiasmartins.spring_security_jwt_basic_giuliana.model.DTO.AuthenticationResponseDTO;
import com.josiasmartins.spring_security_jwt_basic_giuliana.security.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/authenticate")
public class AuthenticationController {
    @Autowired
    private AuthenticationService authenticationService;

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public AuthenticationResponseDTO authenticate(
            Authentication authentication) {

        String token = authenticationService.authenticate(authentication);
        return new AuthenticationResponseDTO(token);
    }
}
