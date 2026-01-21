public class Product {
    private String name;
    private double price;
    private String category;
    private boolean isAvailable;

    public Product(String name, double price, String category, boolean isAvailable) {
        setName(name); // Вызов сеттера для валидации
        setPrice(price);
        this.category = category;
        this.isAvailable = isAvailable;
    }

    public Product() {
        this.name = "Unknown Product";
        this.price = 0.0;
        this.category = "General";
        this.isAvailable = false;
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("⚠️ Warning: Name cannot be empty!");
            this.name = "Default Item";
        }
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("⚠️ Warning: Price cannot be negative! Setting to 0.");
            this.price = 0;
        }
    }

    public void setCategory(String category) { this.category = category; }
    public void setAvailable(boolean available) { isAvailable = available; }

    public String getName() { return name; }
    public double getPrice() { return price; }
    public String getCategory() { return category; }
    public boolean isAvailable() { return isAvailable; }

    public void applyDiscount(double percentage) {
        if (percentage > 0 && percentage <= 100) {
            this.price *= (1 - percentage / 100);
        }
    }

    public boolean isExpensive() { return this.price > 5000; }

    @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + price + ", cat='" + category + "', avail=" + isAvailable + "}";
    }
}