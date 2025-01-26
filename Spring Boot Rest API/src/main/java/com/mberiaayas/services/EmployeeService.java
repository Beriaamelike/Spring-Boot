package com.mberiaayas.services;

import com.mberiaayas.model.Employee;
import com.mberiaayas.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployeeList() {
        return employeeRepository.GetAllEmployeeList();
    }
}
