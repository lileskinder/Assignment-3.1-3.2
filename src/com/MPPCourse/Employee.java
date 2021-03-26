package com.MPPCourse;

public class Employee {
    private String employeeId;
    private String firstName;
    private String middleInitial;
    private String lastName;
    private String birthDate;
    private String ssn;
    private double salary;

    public Employee(String employeeId, String firstName, String middleInitial, String lastName, String birthDate, String ssn, double salary) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.middleInitial = middleInitial;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.ssn = ssn;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void print() {
        System.out.println("Employee ID: " + employeeId + ", " + " " +
                "Employee Name: " + firstName + " " + middleInitial + " " + lastName + ", " + " " +
                "Birth date: " + birthDate + ", " + " " +
                "SSN: " + ssn + ", " + " " +
                "Salary: " + salary
        );
    }
}
