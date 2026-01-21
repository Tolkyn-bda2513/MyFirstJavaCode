import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Product> products = new ArrayList<>();
    private static ArrayList<Customer> customers = new ArrayList<>();
    private static ArrayList<Sale> sales = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Начальные данные (Test Data)
        products.add(new Product("Milk", 450.0, "Dairy", true));
        customers.add(new Customer("Amina", 15000.0, 50, "amina@mail.kz"));
        sales.add(new Sale(1, "Milk", 450.0, "Completed"));

        boolean running = true;
        while (running) {
            System.out.println("\n=== GROCERY STORE SYSTEM ===");
            System.out.println("1. Add Product");
            System.out.println("2. View All Products");
            System.out.println("3. Add Customer");
            System.out.println("4. View All Customers");
            System.out.println("5. Add Sale");
            System.out.println("6. View All Sales");
            System.out.println("0. Exit");
            System.out.print("Choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: addProduct(); break;
                case 2: viewItems(products, "PRODUCTS"); break;
                case 3: addCustomer(); break;
                case 4: viewItems(customers, "CUSTOMERS"); break;
                case 5: addSale(); break;
                case 6: viewItems(sales, "SALES"); break;
                case 0: running = false; break;
                default: System.out.println("Invalid choice!");
            }
        }
        System.out.println("Program finished! 👋");
    }

    private static void addProduct() {
        System.out.print("Name: "); String n = scanner.nextLine();
        System.out.print("Price: "); double p = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Category: "); String c = scanner.nextLine();
        System.out.print("Available (true/false): "); boolean a = scanner.nextBoolean();
        products.add(new Product(n, p, c, a));
    }

    private static void addCustomer() {
        System.out.print("Name: "); String n = scanner.nextLine();
        System.out.print("Email: "); String e = scanner.nextLine();
        customers.add(new Customer(n, 0, 0, e));
    }

    private static void addSale() {
        System.out.print("ID: "); int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Product: "); String p = scanner.nextLine();
        System.out.print("Amount: "); double a = scanner.nextDouble();
        sales.add(new Sale(id, p, a, "Pending"));
    }

    private static void viewItems(ArrayList<?> list, String title) {
        System.out.println("\n--- " + title + " ---");
        if (list.isEmpty()) System.out.println("No data found.");
        for (Object obj : list) System.out.println(obj);
    }
}