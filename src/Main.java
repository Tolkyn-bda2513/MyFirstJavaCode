import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Product> allProducts = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        allProducts.add(new Product("Bag", 50, "Service", 500));
        allProducts.add(new FreshProduct("Milk", 450, "Dairy", 20, 5));
        allProducts.add(new PackagedProduct("Chips", 650, "Snacks", 100, "4870012"));

        boolean running = true;
        while (running) {
            System.out.println("\n=== GROCERY STORE (WEEK 4: INHERITANCE) ===");
            System.out.println("1. Add General Product");
            System.out.println("2. Add Fresh Product");
            System.out.println("3. Add Packaged Product");
            System.out.println("4. View All Products (Polymorphic)");
            System.out.println("5. Make All Products 'Work' (Demo)");
            System.out.println("0. Exit");
            System.out.print("Choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: addGeneral(); break;
                case 2: addFresh(); break;
                case 3: addPackaged(); break;
                case 4: viewAll(); break;
                case 5: demoPolymorphism(); break;
                case 0: running = false; break;
            }
        }
    }

    private static void viewAll() {
        System.out.println("\n--- ALL PRODUCTS ---");
        for (Product p : allProducts) {
            System.out.println(p);
        }
    }

    private static void demoPolymorphism() {
        System.out.println("\n--- POLYMORPHISM IN ACTION ---");
        for (Product p : allProducts) {
            p.work();
        }
    }

    private static void addFresh() {
        System.out.print("Name: "); String name = scanner.nextLine();
        System.out.print("Price: "); double price = scanner.nextDouble();
        System.out.print("Days to expire: "); int days = scanner.nextInt();
        allProducts.add(new FreshProduct(name, price, "Fresh", 10, days));
    }

    private static void addGeneral() { /* ... */ }
    private static void addPackaged() { /* ... */ }
}