package com.mberiaayas.main;

import com.mberiaayas.config.AppConfig;
import com.mberiaayas.model.User;
import com.mberiaayas.services.LoginService;
import com.mberiaayas.services.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);

        for ( User user : userService.getUserList()){
            System.out.println(user);
        }

        LoginService loginService = new LoginService();
        loginService.login();

    }
}
