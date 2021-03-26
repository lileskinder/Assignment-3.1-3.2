package com.MPPCourse;

import java.util.List;

public class Company {
    private String name;
    private List<Department> departments;

    public Company(String name, List<Department> departments) {
        this.name = name;
        this.departments = departments;
    }

    public double getSalary() {
        double salary =0;
        for (Department department : departments) {
            salary += department.getSalary();
        }
        return salary;
    }

    public void print() {
        System.out.println("Company name: " + name + ", ");
        for (Department department : departments) {
            department.print();
        }

    }

    public String getName() {
        return name;
    }
}
