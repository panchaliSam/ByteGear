package com.eureka.auth_service.service;

import com.eureka.auth_service.dto.AuthRequest;
import com.eureka.auth_service.dto.AuthResponse;
import com.eureka.auth_service.dto.RegisterRequest;

public interface AuthService {
    AuthResponse register(RegisterRequest request);
    AuthResponse authenticate(AuthRequest request);
}
