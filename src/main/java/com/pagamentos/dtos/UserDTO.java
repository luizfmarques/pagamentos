package com.pagamentos.dtos;

import com.pagamentos.constants.UserType;

import java.math.BigDecimal;

public record UserDTO(
        String firstName, String lastName, String document, BigDecimal balance, String email, String password, UserType userType) {
}
