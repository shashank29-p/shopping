package com.example.springapi.controller.auth;


import com.example.springapi.DB.insertData;
import com.example.springapi.Helpers.authlogin;
import com.example.springapi.Helpers.response;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class loginController {

    @PostMapping("/login")
    public response login(@RequestBody authlogin credentials) {
        return insertData.userLogin(credentials);
    }

    @GetMapping("/allUser")
    public response getallUsers() {
        return insertData.meow();
    }
}
