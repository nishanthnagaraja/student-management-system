package com.nishanth.studentmanagement.service;
import com.nishanth.studentmanagement.model.Student;

import java.util.List;

public interface StudentService {
    Student addStudent(Student student);
    Student updateStudent(Long id, Student student);
    void deleteStudent(Long id);
    List<Student> getAllStudents();
    Student getStudentById(Long id);
}
