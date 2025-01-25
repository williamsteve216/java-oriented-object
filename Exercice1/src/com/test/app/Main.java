package com.test.app;

import com.test.school.Student;
import com.test.sealed.Circle;
import com.test.sealed.Rectangle;
import com.test.sealed.Shape;

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
    }
}
