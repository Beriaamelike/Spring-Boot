package com.mberiaayas.controller;

import com.mberiaayas.dto.DTOStudent;
import com.mberiaayas.dto.DTOStudentUI;
import com.mberiaayas.entity.Student;

import java.util.List;

public interface IStudentController {

    public DTOStudent saveStudent(DTOStudentUI dtoStudentUI);

    public List<DTOStudent> getAllStudents();

    public DTOStudent getStudentById(Integer id);

    public void deleteStudent(Integer id);

    public DTOStudent updateStudent(Integer id , DTOStudentUI dtoStudentIU);

}
