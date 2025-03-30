package com.uis.jwt_auth_login.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class UserDto {

    private Long id;
    private String firstName;
    private String lastName;
    private String login;
    private String token;



}
