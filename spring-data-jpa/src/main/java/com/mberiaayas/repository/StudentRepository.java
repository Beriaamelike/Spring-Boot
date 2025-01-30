package com.mberiaayas.repository;

import com.mberiaayas.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

    // HQL : sınıfın ismi ve değişken isimleri kullanılarak sorgular yazılır
    // SQL : tablo ismi ve tablo içerisindeki kolon isimleri ile sorgular yazılır

    @Query(value = "from Student" , nativeQuery=false)
    List<Student> findAllStudents();

    @Query(value = "from Student s WHERE s.id= :studentId")
    Optional<Student> findStudentById(Integer studentId);

//    @Query(value = "SELECT * FROM student.student", nativeQuery = true)
//    List<Student> findStudents();
}
