package com.mberiaayas.service.impl;

import com.mberiaayas.dto.DTOStudent;
import com.mberiaayas.dto.DTOStudentUI;
import com.mberiaayas.entity.Student;
import com.mberiaayas.repository.StudentRepository;
import com.mberiaayas.service.IStudentService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public DTOStudent saveStudent(DTOStudentUI dtoStudentUI) {
        Student student = new Student();
        DTOStudent response = new DTOStudent();
        BeanUtils.copyProperties(dtoStudentUI, student);
        Student dbStudent = studentRepository.save(student);
        BeanUtils.copyProperties(dbStudent, response);

        return response;
    }


    @Override
    public List<DTOStudent> getAllStudents() {

        //burada globalproperty ihtiyacınız oldu.
        List<DTOStudent> dtoList = new ArrayList<>();

        List<Student> studentList = studentRepository.findAll();
        for (Student student : studentList) {
            DTOStudent dto = new DTOStudent();
            BeanUtils.copyProperties(student, dto);

            dtoList.add(dto);
        }

        return dtoList;
    }

    @Override
    public DTOStudent getStudentById(Integer id) {
        DTOStudent dtoStudent = new DTOStudent();
        Optional<Student> optional =  studentRepository.findById(id);

        if(optional.isPresent()){
            Student student = optional.get();
            BeanUtils.copyProperties(student, dtoStudent);
        }

        return dtoStudent;
    }

    @Override
    public void deleteStudent(Integer id) {
        Optional<Student> optional = studentRepository.findById(id);
        if (optional.isPresent()) {
            studentRepository.delete(optional.get());
        }
    }

    @Override
    public DTOStudent updateStudent(Integer id, DTOStudentUI dtoStudentUI) {
        DTOStudent dto = new DTOStudent();

        Optional<Student> optional = studentRepository.findById(id);
        if (optional.isPresent()) {
            Student dbStudent = optional.get();

            dbStudent.setFirstName(dtoStudentUI.getFirstName());
            dbStudent.setLastName(dtoStudentUI.getLastName());
            dbStudent.setBirthOfDate(dtoStudentUI.getBirthOfDate());

            Student updatedStudent = studentRepository.save(dbStudent);

            BeanUtils.copyProperties(updatedStudent, dto);
            return dto;

        }
        return null;

    }

}
