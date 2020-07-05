package com.boshko.geekjunior.hw7.services;

import com.boshko.geekjunior.hw7.entities.Student;
import com.boshko.geekjunior.hw7.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private StudentRepository studentRepository;
    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents() {
        List<Student> students = (List<Student>) studentRepository.findAll();
        return students;
    }

    public void addStudent(Student student) {
        studentRepository.save(student);
    }

    public void deleteStudent(Integer id){
        studentRepository.deleteById(id);
    }

}
