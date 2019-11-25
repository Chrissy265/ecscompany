package com.jpco.app.jonesprintcompany.service;

import com.jpco.app.jonesprintcompany.model.User;
import com.jpco.app.jonesprintcompany.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    User findByEmail(String email);

    User save(UserRegistrationDto registration);
}
