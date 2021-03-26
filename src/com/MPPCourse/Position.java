package com.MPPCourse;

import java.util.List;

public class Position {

    private String title;
    private String description;
    private List<Employee> employees;

    public Position(String title, String description, List<Employee> employees) {
        this.title = title;
        this.description = description;
        this.employees = employees;
    }

    public double getSalary() {
        double salary = 0;
        for (Employee employee : employees) {
            salary += employee.getSalary();
        }

        return salary;
    }

    public void print() {

        System.out.println();
        System.out.println("Position title: " + title + ", " + "Position description: " + description + ", ");
        for (Employee employee : employees) {
            employee.print();
        }

    }
}
