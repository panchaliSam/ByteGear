package com.eureka.auth_service.service.Impl;

import com.eureka.auth_service.dto.AuthRequest;
import com.eureka.auth_service.dto.AuthResponse;
import com.eureka.auth_service.dto.RegisterRequest;
import com.eureka.auth_service.repository.UserRepository;
import com.eureka.auth_service.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;


    @Override
    public AuthResponse register(RegisterRequest request) {
        return null;
    }

    @Override
    public AuthResponse authenticate(AuthRequest request) {
        return null;
    }
}
