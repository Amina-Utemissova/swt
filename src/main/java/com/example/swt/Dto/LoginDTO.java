package com.example.swt.Dto;

public class LoginDTO {
    private String email;
    private String passwordHash;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public LoginDTO() {
    }

    public LoginDTO(String email, String passwordHash) {
        this.email = email;
        this.passwordHash = passwordHash;
    }
}
