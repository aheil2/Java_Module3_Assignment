package edu.wctc;

import java.time.LocalDate;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        //EMPLOYEES
        ArrayList<Employee> employees = new ArrayList<>();
        Asset asset = new Asset();
        employees.add(new Employee(1, "Mario", 25.50, LocalDate.of(2001,1,1)));
        employees.add(new Employee(2, "Luigi", 24.50, LocalDate.of(2001,4,12)));
        employees.add(new Employee(3, "Peach", 32.00, LocalDate.of(2004,8,3)));

        //PRODUCTS
        Set<Product> inventory = new HashSet<>();
        inventory.add(new Product("A1B2002", "Super Mushroom", 5.00, 3));
        inventory.add(new Product("A2B1001", "Ice Flower", 10.00, 5));
        inventory.add(new Product("A3B3003", "Super Star", 5.00, 8));

        Map<String, String> productType = new HashMap<>() {{
            put("A1", "Red");
            put("A2", "Blue");
            put("A3", "Yellow");
            put("B1", "Flower");
            put("B2", "Mushroom");
            put("B3", "Star");
        }};
        Map<Character, String > typeDescription = new HashMap<>() {{
            put('A', "Color");
            put('B', "Classification");
        }};

        //MENU
        int choice;
        Scanner keyboard = new Scanner(System.in);
        do {
            System.out.println("Welcome");
            System.out.println("1. Employee Salary Calculator");
            System.out.println("2. Inventory Checker");
            System.out.print("3. Exit\n>");
            choice = Integer.parseInt(keyboard.nextLine());
            if (choice == 1) {
                System.out.println("Employee Salary Checker");
                for (int i = 0; i < employees.size(); i++) {
                    System.out.println((i+1) + ". " + employees.get(i));

                }
                System.out.print("Choose Employee\n>");
                int employeeChoice;
                employeeChoice = Integer.parseInt(keyboard.nextLine());
                employees.get(employeeChoice).calculateSalary(employeeChoice);

            }
            else if (choice == 2) {
                System.out.println("Inventory Checker");
                System.out.print("Product SKU\n>");
                String sku = keyboard.nextLine().toUpperCase();
                System.out.println("Name: ");
                System.out.println("Cost: $");
                System.out.println("Units in Stock: ");
                System.out.println("Classification: ");
                System.out.println("Color: ");
                System.out.println("Enter to return to menu...");
                String backToMenu = keyboard.nextLine();
            }
        } while (choice != 3);

    }
}

