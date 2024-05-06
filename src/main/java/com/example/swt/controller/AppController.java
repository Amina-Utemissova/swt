package com.example.swt.controller;


import com.example.swt.Dto.LoginDTO;
import com.example.swt.Dto.UserDTO;
import com.example.swt.Service.UserService;

import com.example.swt.payload.response.LoginMesage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/auth")
public class AppController {

    @Autowired
    UserService userService;


    @PostMapping("/register")
    public String register(@RequestBody UserDTO userDTO){

        String name = userService.addUser(userDTO);

        return name;
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginDTO loginDTO){
        LoginMesage loginMesage = userService.login(loginDTO);
        return ResponseEntity.ok(loginMesage);

    }


}
