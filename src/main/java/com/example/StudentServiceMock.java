package com.example;

public class StudentServiceMock implements StudentService {
    @Override
    public void createStudent(Student student) {
        // Simulation de la création d'un étudiant avec des données fictives
        System.out.println("Student created: " + student.getName());
    }

    @Override
    public Student getStudentById(int id) {
        // Simulation de la recherche d'un étudiant avec un ID donné
        return new Student(id, "Mock Student");
    }

    @Override
    public void displayAllStudents() {
        // Simulation de l'affichage de tous les étudiants
        System.out.println("Displaying all students (mock data):");
        System.out.println("ID: 1, Name: Med Oustad");
        System.out.println("ID: 2, Name: Oussama Alaouui");
    }
}
