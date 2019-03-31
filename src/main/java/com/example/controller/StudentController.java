/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.controller;

import com.example.service.StudentService;
import entity.Student;
import java.util.Collection;
import javafx.scene.media.Media;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author user
 */
@RestController
@RequestMapping("/")
public class StudentController {
    @Autowired
    StudentService studentservice;
    
   @RequestMapping(value = "/all",method = RequestMethod.GET)
     public Collection<Student> getAllStudents()
    {
        return studentservice.getAllStudents();
    } 
     
     @RequestMapping(value = "/{id}",method = RequestMethod.GET)
     public Student getStudentById(@PathVariable("id") int id)
     {
     return this.studentservice.getStudentById(id);
      }
    
     @RequestMapping(value = "remove/{id}",method = RequestMethod.DELETE)
     public void removeStudentById(@PathVariable("id") int id)
     {
      this.studentservice.removeStudentById(id);
      }
     
      @RequestMapping(method = RequestMethod.PUT, consumes=MediaType.APPLICATION_JSON_VALUE)
      public void updateStudent(@RequestBody Student student)
      {
          this.studentservice.updateStudent(student);
      }
      
      @RequestMapping(method = RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
      public void insertStudent(@RequestBody Student student)
      {
          this.studentservice.insertStudent(student);
      }
}
