package com.example.swt.controller;


import com.example.swt.Dto.UserStoryDTO;
import com.example.swt.Entity.UserStory;
import com.example.swt.Service.UserStoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/userstory")
public class UserStoryController {

    @Autowired
    UserStoryService userStoryService;

    @GetMapping("/getall")
    public List<UserStory> getStories(){
        List<UserStory> userStories = userStoryService.showAll();

        return userStories;
    }

    @PostMapping("/create")
    public String create(@RequestBody UserStoryDTO userStoryDTO){
        String name = userStoryService.addStory(userStoryDTO);

        return name;
    }

}
