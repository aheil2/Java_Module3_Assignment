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
            printMenu();
            choice = Integer.parseInt(keyboard.nextLine());
            if (choice == 1) {
                System.out.println("Employee Salary Checker");
                int count = 0;
                for (Employee e : employees) {
                    count++;
                    System.out.println((count) + ". " + e.getIdentity());
                }
                System.out.print("Choose Employee\n>");
                int employeeChoice = Integer.parseInt(keyboard.nextLine());
                System.out.println(employees.get((employeeChoice - 1)));
            }
            else if (choice == 2) {
                System.out.println("Inventory Checker");
                System.out.print("Product SKU\n>");
                String sku = keyboard.nextLine();
                for (Product p : inventory)
                    if (sku.equals(p.getCode())) {
                        System.out.println(p);
                        String color = sku.substring(0,2);
                        String classification = sku.substring(2,4);
                        String colorReturn = productType.get(color);
                        String classificationReturn = productType.get(classification);
                        System.out.println("Color: " + colorReturn);
                        System.out.println("Classification: " + classificationReturn);
                    }
            }
        } while (choice != 3);

    }
    public static void printMenu() {
        System.out.println("Welcome");
        System.out.println("1. Employee Salary Calculator");
        System.out.println("2. Inventory Checker");
        System.out.print("3. Exit\n>");
    }
}

