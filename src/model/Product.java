package model;

public abstract class Product {
    protected String name;
    protected double price;
    protected String category;
    protected int stock;

    public Product(String name, double price, String category, int stock) {
        setName(name);
        setPrice(price);
        this.category = category;
        this.stock = stock;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative: " + price);
        }
        this.price = price;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Product name cannot be empty!");
        }
        this.name = name;
    }

    public abstract void performQualityCheck();

    public abstract String getProductType();

    @Override
    public String toString() {
        return "[" + getProductType() + "] " + name + " | Price: " + price + " KZT";
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
}