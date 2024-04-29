package com.josiasmartins.spring_security_jwt_basic_giuliana.controller;

import com.josiasmartins.spring_security_jwt_basic_giuliana.security.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {
    @Autowired
    private AuthenticationService authenticationService;

    @PostMapping("authenticate")
    public String authenticate(
            Authentication authentication) {
        return authenticationService.authenticate(authentication);
    }
}
