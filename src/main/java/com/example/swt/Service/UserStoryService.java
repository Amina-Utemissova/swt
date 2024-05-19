package com.example.swt.Service;


import com.example.swt.Dto.UserStoryDTO;
import com.example.swt.Entity.UserStory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserStoryService {

    String addStory(UserStoryDTO userStoryDTO);

    List<UserStory> showAll();
}
