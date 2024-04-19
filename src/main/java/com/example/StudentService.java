package com.example;

public interface StudentService {
    void createStudent(Student student);
    Student getStudentById(int id);
    void displayAllStudents();
}
