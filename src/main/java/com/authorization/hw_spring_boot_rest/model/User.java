package com.authorization.hw_spring_boot_rest.model;

import jakarta.validation.constraints.Size;

public class User {
    @Size(min=5, max=20)
    private String user;

    @Size(min=5, max=20)
    private String password;

    public User(){};

    public User(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
