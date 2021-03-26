package com.MPPCourse;

import java.util.List;

public class Department {
    private String name;
    private String location;
    List<Position> positions;

    public Department(String name, String location, List<Position> positions) {
        this.name = name;
        this.location = location;
        this.positions = positions;
    }

    public double getSalary() {
        double salary = 0;
        for (Position position : positions) {
            salary += position.getSalary();
        }

        return salary;
    }

    public void print() {
        System.out.println();
        System.out.println("**************************************************************************" +
                "\n" +  "Department name: " + name + ", " + "Location: " + location +
                "\n" + "**************************************************************************"
        );
        for (Position position : positions) {

            position.print();
        }
    }
}
