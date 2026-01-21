package model;

public class PackagedProduct extends Product {
    private String barcode;

    public PackagedProduct(String name, double price, String category, int stock, String barcode) {
        super(name, price, category, stock);
        this.barcode = barcode;
    }

    @Override
    public void performQualityCheck() {
        System.out.println("--- Quality Check for " + name + " ---");
        System.out.println("✅ Status: Packaging integrity confirmed.");
        System.out.println("✅ Barcode [" + barcode + "] is readable.");
    }

    @Override
    public String getProductType() {
        return "Packaged Product";
    }

    @Override
    public String toString() {
        return super.toString() + " | Barcode: " + barcode;
    }
}