package com.example.swt.Service;

import com.example.swt.Dto.LoginDTO;
import com.example.swt.Dto.UserDTO;
import com.example.swt.payload.response.LoginMesage;
import org.springframework.stereotype.Service;


@Service
public interface UserService {


    String addUser(UserDTO userDTO);

    LoginMesage login(LoginDTO loginDTO);
}
