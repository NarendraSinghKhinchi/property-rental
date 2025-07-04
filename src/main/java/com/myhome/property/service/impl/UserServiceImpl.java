package com.myhome.property.service.impl;

import com.myhome.property.dto.RegisterUserRequest;
import com.myhome.property.entity.Role;
import com.myhome.property.entity.User;
import com.myhome.property.repository.UserRepository;
import com.myhome.property.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public String registerUser(RegisterUserRequest request) {
        if (userRepository.existsByEmail(request.getEmail())) {
            throw new RuntimeException("Email already registered");
        }

        User user = User.builder()
                .name(request.getName())
                .email(request.getEmail())
                .password(passwordEncoder.encode(request.getPassword()))
                .role(Role.TENANT)
                .build();

        userRepository.save(user);

        return "User registered successfully";
    }
}
