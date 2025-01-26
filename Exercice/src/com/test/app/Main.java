package com.test.app;

import com.parc.Camion;
import com.parc.Voiture;
import com.test.school.Student;
import com.test.sealed.Circle;
import com.test.sealed.Rectangle;
import com.test.sealed.Shape;
import com.test.transport.Vehicule;
import com.parc.Vehicle;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Steve 1", 22, "Informatique");
        student.introduce();

        Student student2 = new Student("Steve 2", 25, "Chimie", "Avennue réné cassin", "Lyon");
        student2.introduce();

        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);

        System.out.println("Aire du cercle : " + circle.calculateArea());
        System.out.println("Aire du rectangle : " + rectangle.calculateArea());

        Voiture voiture = new Voiture("Toyota", 5);
        Camion camion = new Camion("Volvo", 10);

        System.out.println(voiture.getDetails());
        System.out.println(camion.getDetails());

        // Utiliser instanceof
        afficherType(voiture);
        afficherType(camion);

        System.out.println("Nombre total de véhicules créés : " + Vehicle.getNbreVehicles());
    }

    public static void afficherType(Vehicle vehicle) {
        if (vehicle instanceof Voiture) {
            System.out.println("Voiture");
        } else if (vehicle instanceof Camion) {
            System.out.println("Camion");
        } else {
            System.out.println("Autre");
        }
    }
}
