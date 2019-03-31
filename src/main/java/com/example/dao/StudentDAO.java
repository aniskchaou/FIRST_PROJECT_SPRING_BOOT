/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.dao;

import entity.Student;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Repository;

/**
 *
 * @author user
 */
@Repository
public class StudentDAO implements IStudentDAO {
    private static Map<Integer,Student> students;
    
    static{
       students=new HashMap<Integer,Student>(){
           {
           put(1,new Student(1,"said","sdc"));
           put(2,new Student(2,"sdf","sdfsdf"));
           put(3,new Student(3,"sdfs","sdfsdf"));
           }
       };
    }
    
    @Override
   public Collection<Student> getAllStudents()
    {
        return this.students.values();
    }  
   
    @Override
   public Student getStudentById(int id)
   {
       return this.students.get(id);
   }
   
    @Override
   public void removeStudentById(int id)
   {
       this.students.remove(id);
   }
   
    @Override
   public void updateStudent(Student student)
   {
       Student s=this.students.get(student.getId());
       s.setCourse(student.getCourse());
       s.setName(student.getName());
       students.put(student.getId(), student);
       
   }

    @Override
    public void insertStudent(Student student) {
       this.students.put(student.getId(), student);
    }
}
