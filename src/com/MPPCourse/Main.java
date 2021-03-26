package com.MPPCourse;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Employee> softwareEngineersEmployees = new ArrayList<>();
        List<Employee> programmersListEmployees = new ArrayList<>();
        List<Employee> accountantsListEmployees = new ArrayList<>();
        List<Employee> managersListEmployees = new ArrayList<>();

        Employee nobel = new Employee("001", "Nobel", "E", "Yosef", "Dec 12, 1944", "123 -33- 1234", 150000);
        Employee abdure = new Employee("002", "Abdurahman", "I", "Yusuf", "Jan 32, 1954", "321 -11- 3454", 140000);
        Employee kidus = new Employee("003", "Kidus", "T", "Mamuye", "Jan 32, 1954", "321 -11- 3454", 160000);
        Employee teddy = new Employee("004", "Teddy", "I", "Achenef", "Jan 32, 1954", "321 -11- 3454", 180000);

        Employee joseph = new Employee("005", "Joseph", "J", "Lerman", "Dec 12, 1970", "123 -33- 1234", 150000);
        Employee denis = new Employee("006", "Dennis", "M", "Ibrahim", "Jan 32, 1954", "321 -11- 3454", 120000);
        Employee sebastian = new Employee("007", "Jorge", "s", "GilPatino", "Jan 32, 1954", "321 -11- 3454", 110000);
        Employee iyanu = new Employee("008", "Iyanu", "T", "Damilola", "Jan 32, 1954", "321 -11- 3454", 100000);

        softwareEngineersEmployees.add(nobel);
        softwareEngineersEmployees.add(abdure);
        programmersListEmployees.add(kidus);
        programmersListEmployees.add(teddy);
        accountantsListEmployees.add(denis);
        accountantsListEmployees.add(iyanu);
        managersListEmployees.add(joseph);
        managersListEmployees.add(sebastian);


        Position softwareEngineer = new Position("Software Engineer", "Software Engineer...", softwareEngineersEmployees);
        Position programmer = new Position("Programmer", "Programmer...", programmersListEmployees);
        Position manager = new Position("Manager", "Manager...", managersListEmployees);
        Position accountant = new Position("Accountant", "Accountant...", accountantsListEmployees);

        List<Position> iTpositions = new ArrayList<>();
        List<Position> managementPositions = new ArrayList<>();

        iTpositions.add(softwareEngineer);
        iTpositions.add(programmer);
        managementPositions.add(manager);
        managementPositions.add(accountant);

        Department it = new Department("IT", "14th floor, 1401", iTpositions);
        Department management = new Department("Management", "13th floor, 1302", managementPositions);

        List<Department> departments = new ArrayList<>();
        departments.add(it);
        departments.add(management);


        Company company = new Company("Tech X", departments);
        company.print();
        System.out.println("Total salary of the Company: " + company.getSalary());


    }
}
