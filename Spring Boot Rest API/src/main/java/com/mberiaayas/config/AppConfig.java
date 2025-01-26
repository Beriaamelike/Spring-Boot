package com.mberiaayas.config;

import com.mberiaayas.model.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;


@Configuration
public class AppConfig {

    @Bean
    public List<Employee> employeeList(){
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("1","Beria","Ayas"));
        employeeList.add(new Employee("2","Enes","Bayram"));

        return employeeList;
    }
}
