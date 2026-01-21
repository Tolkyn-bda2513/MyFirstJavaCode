public class Product {
    protected String name;
    protected double price;
    protected String category;
    protected int stock;

    public Product(String name, double price, String category, int stock) {
        this.name = name;
        this.price = (price >= 0) ? price : 0;
        this.category = category;
        this.stock = stock;
    }

    public void work() {
        System.out.println("Product " + name + " is ready for sale.");
    }

    public String getRole() { return "General Product"; }

    @Override
    public String toString() {
        return "[" + getRole() + "] " + name + " | Price: " + price + " KZT | Stock: " + stock;
    }

    public String getName() { return name; }
}