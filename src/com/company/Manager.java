package com.company;

public class Manager extends Employee {

    Manager() {
        super();
    }

    public double countSalary() {
        return this.getSalary();
    }
}
