package com.example.swt.payload.response;

public class LoginMesage {
    String message;
    Long id;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LoginMesage(String message, Long id) {
        this.message = message;
        this.id = id;
    }
}
