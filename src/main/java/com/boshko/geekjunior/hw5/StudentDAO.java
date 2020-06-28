package com.boshko.geekjunior.hw5;

import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class StudentDAO {
    private Session currentSession;
    private Transaction currentTransaction​ ;

    public StudentDAO() {
    }

    public Session openCurrentSession() {
        currentSession = CreateSessionFactory.getSessionFactory().openSession();
        return currentSession;
    }

    public Session openCurrentSessionWithTransaction() {
        currentSession = CreateSessionFactory.getSessionFactory().openSession();
        currentTransaction​= currentSession.beginTransaction();
        return currentSession;
    }

    public void closeCurrentSession(){
        currentSession.close();
    }

    public void closeCurrentSessionWithTransaction(){
        currentTransaction​.commit();
        currentSession.close();
    }

    public Session getCurrentSession() {
        return currentSession;
    }

    public void setCurrentSession(Session currentSession) {
        this.currentSession = currentSession;
    }

    public Transaction getCurrentTransaction​() {
        return currentTransaction​;
    }

    public void setCurrentTransaction​(Transaction currentTransaction​) {
        this.currentTransaction​ = currentTransaction​;
    }

    public void ensert(Student student){
        getCurrentSession().save(student);
    }
    public void update(Student student) {
        getCurrentSession().update(student);
    }
    public Student findById​ (long id){
        Student student=(Student) getCurrentSession().get(Student.class,id);
        return student ;
    }

    public void delete(Student student ) {
        getCurrentSession().delete(student);
        getCurrentSession().flush();
    }

    public List<Student> findAll() {
        List<Student> students = (List<Student>) getCurrentSession().createQuery("from Student").list();
        return students;
    }

    public void deleteAll(){
        List<Student> studentList = findAll();
        for (Student student: studentList) {
            delete(student);
        }
    }
}
