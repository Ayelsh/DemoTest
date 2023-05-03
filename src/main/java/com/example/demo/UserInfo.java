package com.example.demo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class UserInfo {

    private String username;

    private String password;
}
