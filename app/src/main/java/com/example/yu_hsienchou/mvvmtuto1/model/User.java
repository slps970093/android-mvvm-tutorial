package com.example.yu_hsienchou.mvvmtuto1.model;

public class User {
    private String email;
    private String password;
    public String emailhint;
    public String passwordhint;
    public User(String username, String password){
        this.emailhint = username;
        this.passwordhint = password;
    }
}
