package com.test.app;

import com.test.school.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Steve 1", 22, "Informatique");
        student.introduce();

        Student student2 = new Student("Steve 2", 25, "Chimie", "Avennue réné cassin", "Lyon");
        student2.introduce();
    }
}
