package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class GestionEtudiants2 {

	public static void main(String[] args) {
		SpringApplication.run(GestionEtudiants2.class, args);
		 ApplicationContext context = SpringApplication.run(GestionEtudiants2.class, args);
	        
	        // Récupérer le bean StudentService à partir du contexte
	        StudentService studentService = context.getBean(StudentService.class);
	        
	        // Utiliser les méthodes appropriées du StudentService
	        // Par exemple, créer un nouvel étudiant
	        Student student1 = new Student(1, "John Doe");
	        studentService.createStudent(student1);
	        
	        // Rechercher un étudiant par ID
	        Student retrievedStudent = studentService.getStudentById(1);
	        System.out.println("Retrieved student: " + retrievedStudent.getName());
	        
	        // Afficher tous les étudiants
	        studentService.displayAllStudents();
	    }
	
	 @Bean
	    public StudentService studentService(StudentRepository studentRepository) {
	        return new StudentServiceImplement(studentRepository);
	    }
	    
	    @Bean
	    public StudentRepository studentRepository() {
	        return new InMemoryStudentRepository();
	    }

}
