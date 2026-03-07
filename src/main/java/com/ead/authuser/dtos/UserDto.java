package com.ead.authuser.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDto {

    private String username;

    private String email;

    private String password;

    private String oldPassword;

    private String fullName;

    private String phoneNumber;

    private String cpf;

    private String imageUrl;

}
