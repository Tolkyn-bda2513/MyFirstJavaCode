public class Product {
    // 4 private fields
    private String name;
    private double price;
    private String category;
    private boolean isAvailable;

    // constructure with parameters
    public Product(String name, double price, String category, boolean isAvailable) {
        setName(name);
        setPrice(price);
        this.price = price;
        this.category = category;
        this.isAvailable = isAvailable;
    }

    // default constructure
    public Product() {
        this.name = "Unknown Item";
        this.price = 0.0;
        this.category = "General";
        this.isAvailable = false;
    }

    // setters
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Warning: Product name cannot be empty!");
            this.name = "Default Product";
        }
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Warning: Price cannot be negative! Setting to 0.");
            this.price = 0;
        }
    }

    public void setCategory(String category) { this.category = category; }
    public void setAvailable(boolean available) { isAvailable = available; }

    // getters
    public String getName() { return name; }
    public double getPrice() { return price; }
    public String getCategory() { return category; }
    public boolean isAvailable() { return isAvailable; }

    // additional methods
    public void applyDiscount(double percentage) {
        if (percentage > 0 && percentage <= 100) {
            this.price *= (1 - percentage / 100);
        } else {
            System.out.println("Invalid discount percentage!");
        }
    }

    public boolean isExpensive() { return this.price > 5000; }

    //toString
    @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + price + ", category='" + category + "', available=" + isAvailable + "}";
    }
}