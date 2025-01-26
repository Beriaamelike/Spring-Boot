package com.mberiaayas.config;


import com.mberiaayas.model.User;
import com.mberiaayas.services.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {

    @Bean
    public UserService userService() {
        UserService userService = new UserService();

        List<User> userList = new ArrayList<>();
        userList.add(new User("Melike"));
        userList.add(new User("Beria"));

        userService.setUserList(userList);

        return userService;
    }
}
