package model;

public class FreshProduct extends Product {
    private int shelfLife;

    public FreshProduct(String name, double price, String category, int stock, int shelfLife) {
        super(name, price, category, stock);
        this.shelfLife = shelfLife;
    }

    @Override
    public void performQualityCheck() {
        System.out.println("--- Quality Check for " + name + " ---");
        if (shelfLife < 2) {
            System.out.println("❌ ALERT: Product is nearly expired! Check for mold.");
        } else {
            System.out.println("✅ Status: Fresh and safe for sale.");
        }
    }

    @Override
    public String getProductType() {
        return "Fresh Product";
    }

    @Override
    public String toString() {
        return super.toString() + " | Exp: " + shelfLife + " days";
    }
}