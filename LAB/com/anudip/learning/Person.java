package com.anudip.learning;
public class Person {
    String name="John Doe";
    int age=30;
    int salary=50000;
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("Test Successful!");
        System.out.println("Name: " + person.name);
        System.out.println("Age: " + person.age);
        System.out.println("Salary: " + person.salary);
    }
}
