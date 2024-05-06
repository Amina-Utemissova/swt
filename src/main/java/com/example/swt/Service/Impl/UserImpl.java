package com.example.swt.Service.Impl;

import com.example.swt.Dto.LoginDTO;
import com.example.swt.Dto.UserDTO;
import com.example.swt.Entity.User;
import com.example.swt.Repo.UserRepo;
import com.example.swt.Service.UserService;
import com.example.swt.payload.response.LoginMesage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


@Service
public class UserImpl implements UserService{

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public String addUser(UserDTO userDTO) {

        User user = new User(userDTO.getId(),
                            userDTO.getEmail(),
                            userDTO.getFirstName(),
                            userDTO.getLastName(),
                            this.passwordEncoder.encode(userDTO.getPasswordHash()),
                            userDTO.getRole()
        );
        if(userRepo.findByEmail(user.getEmail())==null){
            userRepo.save(user);
            return user.getFirstName();
        }
        return "401 the user already exists";
    }

    @Override
    public LoginMesage login(LoginDTO loginDTO) {
        User user = userRepo.findByEmail(loginDTO.getEmail());

        if(user == null || !passwordEncoder.matches(loginDTO.getPasswordHash(),user.getPasswordHash()))
            return new LoginMesage("Login failed: incorrect email or password", false);

        return new LoginMesage("Login Success", true);

    }
}
