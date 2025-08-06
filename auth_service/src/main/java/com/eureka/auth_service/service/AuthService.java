package com.eureka.auth_service.service;

import com.eureka.auth_service.dto.AuthRequest;
import com.eureka.auth_service.dto.AuthResponse;
import com.eureka.auth_service.dto.RegisterRequest;

public interface AuthService {
    public AuthResponse register(RegisterRequest request);
    public AuthResponse authenticate(AuthRequest request);
}
