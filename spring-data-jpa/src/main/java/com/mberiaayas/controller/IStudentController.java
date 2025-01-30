package com.mberiaayas.controller;

import com.mberiaayas.entity.Student;

import java.util.List;

public interface IStudentController {

    public Student saveStudent(Student student);

    public List<Student> getAllStudents();

    public Student getStudentById(Integer id);

    public void deleteStudent(Integer id);

    public Student updateStudent(Integer id,Student updateStudent);
}
