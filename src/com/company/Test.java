package com.company;

public class Test {
    int size;
    Test(int size){
        this.size = size;
    }

    public void makeTests() {
        EmployeeService service = new EmployeeService(size);
        service.printEmployee();
        System.out.println("lets sort it by name");
        service.sortByName();
        service.printEmployee();
        System.out.println("lets calculate all salarys: " + service.calculateAllSalarys());
        System.out.println();
        System.out.println("Employee #2 = " + service.getById(2).getName());
        System.out.println("Employee Паша = " + service.getByName("Паша").getId());
        System.out.println();
        System.out.println("Delete fifth employee and add first");
        System.out.println();
        service.remove(5);
        service.add(service.getEmployee(1));
        service.printEmployee();
        service.edit(service.getEmployee(1));
    }
}
