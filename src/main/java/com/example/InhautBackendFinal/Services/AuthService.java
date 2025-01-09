package com.example.InhautBackendFinal.Services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.net.http.HttpResponse;
import java.util.Objects;

@Service
public class AuthService {
    @Value("${blog.username}")
    private String username;
    @Value("${blog.password}")
    private String password;

    public boolean login (String username, String password){
        if (Objects.equals(username, this.username) && Objects.equals(password,this.password)){
            return true;
        }
        return false;
    }
}
