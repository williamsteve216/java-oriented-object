package com.test.school;

public class Person {
    private String name;
    private int age;
    private Address address;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, String street, String city) {
        this(name, age);
        this.address = new Address(street, city);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void introduce() {
        System.out.println("Je suis " + this.name + ", j'ai " + this.age);
    }

    public void fullAddress() {
        System.out.println("Adresse : " + this.address.street + ", " + this.address.city);
    }

    public class Address {
        public String street;
        public String city;

        public Address(String street, String city) {
            this.street = street;
            this.city = city;
        }
    }
}