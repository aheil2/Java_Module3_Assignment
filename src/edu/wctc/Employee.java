package edu.wctc;

import java.time.LocalDate;
import java.util.Scanner;

public class Employee extends Asset implements Employable {
    private LocalDate startDate;

    public Employee(int id, String name, Double payRate, LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public double calculateSalary(double payRate) {
        System.out.print("How many hours worked?\n>");
        Scanner keyboard = new Scanner(System.in);
        double hoursWorked = Double.parseDouble(keyboard.nextLine());
        double salary = payRate * hoursWorked;
        return salary;
    }

    @Override
    public String toString() {
        //HOW TO GET THE STORED EMPLOYEE VALUES THAT USE ASSET CLASS VARIABLES
        return String.format("Employee name: %d\nEmployee Start Date: %d\nEmployee Pay Rate: %d\nCalculated Salary: ", getIdentity(), getStartDate(), getValue());
    }
}
