/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.dao;

import entity.Student;
import java.util.Collection;

/**
 *
 * @author user
 */
public interface IStudentDAO {

    Collection<Student> getAllStudents();

    Student getStudentById(int id);

    void insertStudent(Student student);

    void removeStudentById(int id);

    void updateStudent(Student student);
    
}
