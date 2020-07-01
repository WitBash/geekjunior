package com.boshko.geekjunior.hw5;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentDAO studentDAO = new StudentDAO();

        //INSERT
//        studentDAO.openCurrentSession();
//        for (int i = 0; i < 1000; i++) {
//            Student tempStudent = new Student();
//            tempStudent.setName("Student" + (i + 1));
//            tempStudent.setMark(5);
//            studentDAO.ensert(tempStudent);
//        }
//        studentDAO.closeCurrentSession();

//        //UPDATE
//        studentDAO.openCurrentSessionWithTransaction();
//        Student student = studentDAO.getCurrentSession().get(Student.class,1L);
//        student.setMark(4);
//        studentDAO.update(student);
//        studentDAO.closeCurrentSessionWithTransaction();

        //FINDBYID
//        studentDAO.openCurrentSession();
//        Student student = studentDAO.findById​(3L);
//        System.out.println(student);
//        studentDAO.closeCurrentSession();

        //FINDALL
//        studentDAO.openCurrentSession();
//        List<Student> studentsList = studentDAO.findAll();
//        for (Student student:studentsList) {
//            System.out.println(student);
//        }
//        studentDAO.closeCurrentSession();

        //DELETE
//        studentDAO.openCurrentSessionWithTransaction();
//        Student student = studentDAO.getCurrentSession().get(Student.class,1000L);
//        studentDAO.delete(student);
//        studentDAO.closeCurrentSessionWithTransaction();

        //DELETE ALL
        studentDAO.openCurrentSessionWithTransaction();
        studentDAO.deleteAll();
        studentDAO.closeCurrentSessionWithTransaction();
    }
}
