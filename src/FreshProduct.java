public class FreshProduct extends Product {
    private int shelfLife;

    public FreshProduct(String name, double price, String category, int stock, int shelfLife) {
        super(name, price, category, stock);
        this.shelfLife = shelfLife;
    }

    @Override
    public void work() {
        System.out.println("Checking freshness... " + name + " is fresh for " + shelfLife + " more days.");
    }

    @Override
    public String getRole() { return "Fresh Product"; }

    public void checkTemperature() {
        System.out.println("Maintaining cool temperature for " + name);
    }

    @Override
    public String toString() {
        return super.toString() + " | Exp: " + shelfLife + " days";
    }
}