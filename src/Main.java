public class Main {
    public static void main(String[] args) {
        // Welcome message
        System.out.println("=== Grocery Store Management System ===");
        System.out.println();

        // Create objects all 3 classes
        Product prod1 = new Product("Apple", 800.0, "Fruit", true);
        Product prod2 = new Product("Meat", 3500.0, "Meat", true);

        Customer cust1 = new Customer("Aray aray", 15000.0, 100, true);

        Sale sale1 = new Sale(101, "Meat", 3500.0, "Pending");
        Sale sale2 = new Sale(); // Default constructor

        //display initial state
        System.out.println("--- INITIAL STATE ---");
        System.out.println(prod1);
        System.out.println(cust1);
        System.out.println(sale1);
        System.out.println(sale2);
        System.out.println();

        // Test getters
        System.out.println("--- TESTING GETTERS ---");
        System.out.println("Product 1 Name: " + prod1.getName());
        System.out.println("Sale 1 Amount: " + sale1.getAmount() + " KZT");
        System.out.println();

        // Test setters
        System.out.println("--- TESTING SETTERS ---");
        System.out.println("Setting values for default sale2...");
        sale2.setTransactionId(102);
        sale2.setProductName("Apple");
        sale2.setAmount(800.0);
        sale2.setStatus("Pending");
        System.out.println("Updated Sale 2: " + sale2);
        System.out.println();

        // test additional methods
        System.out.println("--- TESTING ADDITIONAL METHODS ---");

        System.out.println("Applying 10% discount to " + prod1.getName());
        prod1.applyDiscount(10);
        System.out.println("New Price: " + prod1.getPrice());

        System.out.println("Applying 12% tax to Sale 1...");
        sale1.applyTax(12);
        System.out.println("New Sale Amount: " + sale1.getAmount());

        System.out.println("Completing Sale 1...");
        sale1.completeSale();
        System.out.println("Sale 1 Status: " + sale1.getStatus());

        System.out.println("Customer is loyal: " + cust1.isLoyalCustomer());
        cust1.earnPoints(sale1.getAmount());
        System.out.println("Customer new bonus points: " + cust1.getBonusPoints());
        System.out.println();

        //final summary
        System.out.println("--- FINAL STATE ---");
        System.out.println(prod1);
        System.out.println(cust1);
        System.out.println(sale1);
        System.out.println(sale2);

        System.out.println("\n=== Program Complete ===");
    }
}