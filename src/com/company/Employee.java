package com.company;

import java.util.Random;

public class Employee {
    private int id;
    private String name;
    private int age;
    private double salary;
    private String gender;

    Employee() {
        id = 0;
        name = null;
        age = 0;
        salary = 0;
        gender = null;
    }

    Employee(int id, String name, int age, double salary, String gender, int fixedBugs) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
    }

    public double countSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String getGender() {
        return gender;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}


