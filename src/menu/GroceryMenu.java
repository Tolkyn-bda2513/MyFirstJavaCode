package menu;

import model.*;
import java.util.ArrayList;
import java.util.Scanner;

public class GroceryMenu implements Menu {
    private ArrayList<Product> allProducts = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public GroceryMenu() {
        allProducts.add(new FreshProduct("Milk", 450, "Dairy", 20, 5));
        allProducts.add(new PackagedProduct("Chips", 600, "Snacks", 50, "487001"));
    }

    @Override
    public void displayMenu() {
        System.out.println("\n========================================");
        System.out.println("      GROCERY STORE MANAGEMENT");
        System.out.println("========================================");
        System.out.println("1. Add Fresh Product (Milk, Bread)");
        System.out.println("2. Add Packaged Product (Canned, Snacks)");
        System.out.println("3. View All Products");
        System.out.println("4. Run Quality Check (Polymorphism)");
        System.out.println("0. Exit");
        System.out.print("Enter choice: ");
    }

    @Override
    public void run() {
        boolean running = true;
        while (running) {
            displayMenu();
            try {
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1: addFresh(); break;
                    case 2: addPackaged(); break;
                    case 3: viewAll(); break;
                    case 4: checkAll(); break;
                    case 0: running = false; break;
                    default: System.out.println("Invalid option! ❌");
                }
            } catch (NumberFormatException e) {
                System.out.println("❌ Error: Please enter a number, not text!");
            } catch (Exception e) {
                System.out.println("❌ Error: " + e.getMessage());
            }
        }
    }

    private void addFresh() {
        try {
            System.out.print("Name: "); String n = scanner.nextLine();
            System.out.print("Price: "); double p = Double.parseDouble(scanner.nextLine());
            System.out.print("Exp. days: "); int d = Integer.parseInt(scanner.nextLine());
            allProducts.add(new FreshProduct(n, p, "Fresh", 10, d));
            System.out.println("Added! 🍏");
        } catch (Exception e) {
            System.out.println("❌ Failed to add: " + e.getMessage());
        }
    }

    private void addPackaged() {
        try {
            System.out.print("Name: "); String n = scanner.nextLine();
            System.out.print("Price: "); double p = Double.parseDouble(scanner.nextLine());
            System.out.print("Barcode: "); String b = scanner.nextLine();
            allProducts.add(new PackagedProduct(n, p, "Packaged", 20, b));
            System.out.println("Added! 📦");
        } catch (Exception e) {
            System.out.println("❌ Failed to add: " + e.getMessage());
        }
    }

    private void viewAll() {
        System.out.println("\n--- STORE INVENTORY ---");
        for (Product p : allProducts) {
            System.out.println(p);
        }
    }

    private void checkAll() {
        System.out.println("\n--- QUALITY CHECK ---");
        for (Product p : allProducts) {
            p.performQualityCheck();
        }
    }
}
