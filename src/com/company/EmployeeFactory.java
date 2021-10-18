package com.company;

import java.util.Random;

public class EmployeeFactory {

    public Employee[] generateEmployees(int size) {
        Employee[] newEmployee = new Employee[size];
        for (int i = 0; i < size; i++) {
            Random random = new Random();
            newEmployee[i] = new Employee();
            newEmployee[i].setAge(20+random.nextInt(80));
            newEmployee[i].setId(i+1);
            if(random.nextInt()%2 == 0) {
                newEmployee[i].setGender("male");
            } else {
                newEmployee[i].setGender("female");
            }
            newEmployee[i].setSalary(50000+random.nextInt(40000));
            String[] maleNames = { "Коля", "Петя", "Леша", "Дима", "Толя", "Деня", "Макс", "Паша", "Витя", "Миша"};
            String[] femaleNames = { "Маша", "Даша", "Лена", "Зина", "Лиза", "Таня", "Вика", "Лера", "Вера", "Надя"};
            int randValue = random.nextInt(10);
            if (newEmployee[i].getGender() == "male") {
                newEmployee[i].setName(maleNames[randValue]);
            } else {
                newEmployee[i].setName(femaleNames[randValue]);
            }
        }
        return newEmployee;
    }
}