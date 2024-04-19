package com.example;

import java.util.List;

public interface StudentRepository {
    // Enregistrer un étudiant
    void save(Student student);
    
    // Rechercher un étudiant par son ID
    Student findById(int id);
    
    // Récupérer tous les étudiants
    List<Student> findAll();
}
