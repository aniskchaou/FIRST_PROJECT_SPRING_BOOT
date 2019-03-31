/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.service;

import com.example.dao.StudentDAO;
import entity.Student;
import java.util.Collection;
import javax.xml.ws.RequestWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author user
 */
@Service

public class StudentService {
    @Autowired
    StudentDAO studentsdao;
   public Collection<Student> getAllStudents()
    {
        return this.studentsdao.getAllStudents();
    }  
   
    public Student getStudentById(int id)
   {
       return this.studentsdao.getStudentById(id);
   }
    
     public void removeStudentById(int id)
   {
       this.studentsdao.removeStudentById(id);
   }
     
     public void updateStudent(Student student)
   {
       
       this.studentsdao.updateStudent(student);
   }

    public void insertStudent(Student student) {
        this.studentsdao.insertStudent(student);
    }
}
