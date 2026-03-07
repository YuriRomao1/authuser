package com.ead.authuser.services.impl;

import com.ead.authuser.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImplements {

    @Autowired
    UserRepository userRepository;
}
