package com.boshko.geekjunior.hw7.controllers;

import com.boshko.geekjunior.hw7.entities.Student;
import com.boshko.geekjunior.hw7.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/studentsInfo")
public class StudentController {
    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/showStudents")
    public String showStudents(Model model) {
        List<Student> students = studentService.getAllStudents();
        model.addAttribute("students", students);
        return "studentsInfo";
    }

    @DeleteMapping("/showStudents/{id}")
    public String deleteStudentById(@PathVariable("id") Integer id){
        studentService.deleteStudent(id);
        return "redirect:/showStudents";
    }

    @PostMapping("/showStudents/add")
    public String addStudent(@ModelAttribute("name") String name,
                             @ModelAttribute("age") Integer age) {

        Student tempStudent = new Student();
        tempStudent.setName(name);
        tempStudent.setAge(age);

        studentService.addStudent(tempStudent);

        return "redirect:/showStudents";
    }

}
