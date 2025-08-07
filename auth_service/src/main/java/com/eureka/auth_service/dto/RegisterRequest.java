package com.eureka.auth_service.dto;

import com.eureka.auth_service.type.Role;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RegisterRequest {
    @NotNull
    private String name;
    @Email
    @NotNull
    private String email;
    @NotNull
    @Pattern(
            regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@$!%*#?&])(?=\\S+$).{8,20}$",
            message = "Password must be 8-20 characters long and include at least one digit, one lowercase letter, one uppercase letter, and one special character."
    )
    private String password;
    @NotNull
    private Role role;
}
