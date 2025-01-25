package com.test.school;

public class Student extends Person {
    public String subject;

    public Student(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public Student(String name, int age, String subject, String street, String city) {
        super(name, age, street, city);
        this.subject = subject;
    }

    @Override
    public void introduce() {
        if (this.getAddress() != null) {
            System.out.println("Je suis " + super.getName() + ", j'ai " + super.getAge() + "J'étudie " + this.subject);
            this.fullAddress();
        } else {
            System.out.println("Je suis " + super.getName() + ", j'ai " + super.getAge() + "J'étudie " + this.subject);
        }
    }
}