package com.josiasmartins.spring_security_jwt_basic_giuliana.entity;

import jakarta.annotation.Generated;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("USERS")
@Data
public class User {
    @Id
    private String username;
    private String password;

}
