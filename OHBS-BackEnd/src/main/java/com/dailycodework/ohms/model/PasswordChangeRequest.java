package com.dailycodework.ohms.model;

import lombok.Data;

@Data
public class PasswordChangeRequest {
    private String email;
    private String otp;
    private String newPassword;
}
