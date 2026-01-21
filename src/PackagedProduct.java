public class PackagedProduct extends Product {
    private String barcode;

    public PackagedProduct(String name, double price, String category, int stock, String barcode) {
        super(name, price, category, stock);
        this.barcode = barcode;
    }

    @Override
    public void work() {
        System.out.println("Scanning barcode " + barcode + " for " + name);
    }

    @Override
    public String getRole() { return "Packaged Product"; }

    // Уникальный метод
    public void printLabel() {
        System.out.println("Printing shipping label for barcode: " + barcode);
    }

    @Override
    public String toString() {
        return super.toString() + " | SKU: " + barcode;
    }
}