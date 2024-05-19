package com.example.swt.Service.Impl;

import com.example.swt.Dto.UserStoryDTO;
import com.example.swt.Entity.UserStory;
import com.example.swt.Repo.UserStoryRepo;
import com.example.swt.Service.UserStoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserStoryImpl implements UserStoryService {

    @Autowired
    UserStoryRepo userStoryRepo;

    @Override
    public String addStory(UserStoryDTO userStoryDTO) {
        UserStory userStory= new UserStory(userStoryDTO.getId(),
                userStoryDTO.getTitle(),
                userStoryDTO.getDescription(),
                userStoryDTO.getCreatedBy(),
                userStoryDTO.getPriority()
        );

        userStoryRepo.save(userStory);

        return userStory.getTitle();
    }

    @Override
    public List<UserStory> showAll() {

        return userStoryRepo.findAll();
    }
}
