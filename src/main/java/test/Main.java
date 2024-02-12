package test;

import entities.etudiant;
import entities.user;
import services.ServiceEtudiant;
import services.ServiceUser;

import java.io.File;
import java.sql.SQLException;
import java.sql.Connection;
import java.nio.file.Files;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {
        user u1 = new user("aziz","abid","aaa","mdppp","123");
        ServiceUser services =new ServiceUser();
        /*try {
            services.ajouter(u1);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }*/
        /*try {
            services.modifier(u1);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }*/
        /*try {
            services.supprimer(u1);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }*/
       /* try {
            System.out.println( services.afficher());
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }*/




        // etudiannnttt
        Connection connection = null; // Initialize your connection object here

        // Read the PDF file and convert it to a byte array for the course description
        byte[] cv = null;
        try {
            File pdfFile = new File("C:/Users/khouloud/Downloads/File.pdf"); // Update with the actual path to your PDF file
            cv = Files.readAllBytes(pdfFile.toPath());
        } catch (IOException e) {
            e.printStackTrace();
            return; // Exit the method if an error occurs
        }

        // Create a new course instance
        etudiant cr = new etudiant("java", 33, cv);
        ServiceEtudiant serviceC = new ServiceEtudiant();

        // Call the method to add the course to the database
        try {
            serviceC.ajouter(cr);
            System.out.println("Course added successfully!");
        } catch (SQLException e) {
            System.out.println("Error adding course: " + e.getMessage());
        }



    }
}
