package com.mberiaayas.controller.impl;

import com.mberiaayas.controller.IStudentController;
import com.mberiaayas.dto.DTOStudent;
import com.mberiaayas.dto.DTOStudentUI;
import com.mberiaayas.entity.Student;
import com.mberiaayas.service.IStudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/api/student")
public class StudentControllerImpl implements IStudentController {

    @Autowired
    private IStudentService studentService;


    @PostMapping(path = "/save")
    @Override
    public DTOStudent saveStudent(@RequestBody @Valid DTOStudentUI dtoStudentUI) {
        return studentService.saveStudent(dtoStudentUI);
    }

    @GetMapping(path= "/list")
    @Override
    public List<DTOStudent> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping(path = "/list/{id}")
    @Override
    public DTOStudent getStudentById(@PathVariable(name = "id") Integer id) {
        return studentService.getStudentById(id);
    }

    @DeleteMapping(path = "/delete/{id}")
    @Override
    public void deleteStudent(@PathVariable(name = "id") Integer id) {
         studentService.deleteStudent(id);
    }

    @PutMapping(path = "/update/{id}")
    @Override
    public DTOStudent updateStudent(@PathVariable(name = "id") Integer id, @RequestBody DTOStudentUI dtoStudentUI) {
        return studentService.updateStudent(id, dtoStudentUI);
    }
}
