package edu.wctc;

import java.time.LocalDate;
import java.util.Scanner;

public class Employee extends Asset implements Employable {
    private LocalDate startDate;

    public Employee(int id, String name, Double payRate, LocalDate startDate) {
        //initializes code from asset
        super(id, name, payRate);
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
        return payRate * hoursWorked;
    }

    @Override
    public String toString() {
        //HOW TO GET THE STORED EMPLOYEE VALUES THAT USE ASSET CLASS VARIABLES
        return String.format("Employee name: %s\nEmployee Start Date: %s\nEmployee Pay Rate: $%s\nCalculated Salary: $%s", getIdentity(), getStartDate(), getValue(), calculateSalary((Double) getValue()));
    }

}
