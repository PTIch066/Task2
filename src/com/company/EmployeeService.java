package com.company;

import java.lang.reflect.Member;
import java.util.Scanner;

public class EmployeeService {
    private Employee[] allEmployee;

    EmployeeService(int size) {
        allEmployee = (new EmployeeFactory().generateEmployees(size));
    }

    public void printEmployee() {
        for (int i = 0; i < allEmployee.length; i++) {
            System.out.println("Employee № " + i);
            System.out.println("ID = " + allEmployee[i].getId());
            System.out.println("age = " + allEmployee[i].getAge());
            System.out.println("name = " + allEmployee[i].getName());
            System.out.println("salary = " + allEmployee[i].getSalary());
            System.out.println("gender = " + allEmployee[i].getGender());
            System.out.println("finalSalary = " + allEmployee[i].countSalary());
            System.out.println();
        }
    }

    public double calculateAllSalarys() {
        double finalSalary = 0;
        for (int i = 0; i < allEmployee.length; i++) {
            finalSalary += allEmployee[i].countSalary();
        }
        return finalSalary;
    }

    public Employee getById(int id) {
        for (int i = 0; i < allEmployee.length; i++) {
            if (allEmployee[i].getId() == id){
                return allEmployee[i];
            }
        }
        return allEmployee[0];
    }
    public Employee getByName(String name){
        for (int i = 0; i < allEmployee.length; i++) {
            if (allEmployee[i].getName() == name){
                return allEmployee[i];
            }
        }
        return allEmployee[0];
    }

    public Employee[] sortByName(){
        String reservVal;
        for (int i = 0; i < allEmployee.length-1; i++) {
            if(allEmployee[i].getName().compareTo(allEmployee[i+1].getName()) < 0) {
                reservVal = allEmployee[i].getName();
                allEmployee[i].setName(allEmployee[i+1].getName());
                allEmployee[i+1].setName(reservVal);
                i = -1;
            }
        }
        return allEmployee;
    }

    public Employee[] sortByNameAndSalary(){
        String reservVal;
        for (int i = 0; i < allEmployee.length-1; i++) {
            if(allEmployee[i].getName().compareTo(allEmployee[i+1].getName()) < 0) {
                reservVal = allEmployee[i].getName();
                allEmployee[i].setName(allEmployee[i+1].getName());
                allEmployee[i+1].setName(reservVal);
                i = -1;
            } else if(allEmployee[i].getName().compareTo(allEmployee[i+1].getName()) == 0) {
                if(allEmployee[i].getSalary()> allEmployee[i+1].getSalary()) {
                    reservVal = allEmployee[i].getName();
                    allEmployee[i].setName(allEmployee[i+1].getName());
                    allEmployee[i+1].setName(reservVal);
                    i = -1;
                }
            }
        }
        return allEmployee;
    }

    public Employee remove(int id) {
        Employee[] newEmployee = new Employee[allEmployee.length - 1];
        int delIndex = 0;
        Employee delEmployee = allEmployee[delIndex];
        for (int i = 0; i < allEmployee.length; i++) {
            if (allEmployee[i].getId() == id) {
                delIndex = i;
                delEmployee = allEmployee[i];
                break;
            }
        }
        for (int i = 0; i < newEmployee.length; i++) {
            if(i == delIndex) {
                newEmployee[i] = allEmployee[i+1];
            } else {
                newEmployee[i] = allEmployee[i];
            }
            newEmployee[i].setId(i + 1);
        }
        allEmployee = newEmployee;
        return delEmployee;
    }

    public void add(Employee employee) {
        Employee[] newEmployee = new Employee[allEmployee.length + 1];
        for (int i = 0; i < allEmployee.length; i++) {
            newEmployee[i] = allEmployee[i];
        }
        employee.setId(newEmployee.length -1);
        newEmployee[newEmployee.length -1] = employee;
        allEmployee = newEmployee;
    }

    public Employee edit(Employee employee) {
        Scanner scanner = new Scanner(System.in);

        Employee oldEmployee = employee;
        Employee newEmployee = new Employee();

        newEmployee.setId(employee.getId());
        System.out.println("Enter new name = ");
        newEmployee.setName(scanner.nextLine());
        System.out.println("Enter new age = ");
        newEmployee.setAge(Integer.parseInt(scanner.nextLine()));
        System.out.println("Enter new salary = ");
        newEmployee.setSalary(Double.parseDouble(scanner.nextLine()));
        System.out.println("Enter new gender = ");
        newEmployee.setGender(scanner.nextLine());
        employee = newEmployee;
        return oldEmployee;
    }

    public Employee[] getEmployeeArray() {
        return allEmployee;
    }

    public void setEmployeeArray(Employee[] newArray) {
        this.allEmployee = newArray;
    }

    public Employee getEmployee(int id){
        for (int i = 0; i < allEmployee.length; i++) {
            if (allEmployee[i].getId() == id) {
                return allEmployee[i];
            }
        }
        return allEmployee[0];
    }
}
