public class Customer {
    // 4 private fields
    private String fullName;
    private double totalSpent;
    private int bonusPoints;
    private boolean hasDiscountCard;

    // constructure with parameters
    public Customer(String fullName, double totalSpent, int bonusPoints, boolean hasDiscountCard) {
        this.fullName = fullName;
        this.totalSpent = totalSpent;
        this.bonusPoints = bonusPoints;
        this.hasDiscountCard = hasDiscountCard;
    }

    //default constructure
    public Customer() {
        this.fullName = "New Customer";
        this.totalSpent = 0.0;
        this.bonusPoints = 0;
        this.hasDiscountCard = false;
    }

    // getters
    public String getFullName() { return fullName; }
    public double getTotalSpent() { return totalSpent; }
    public int getBonusPoints() { return bonusPoints; }
    public boolean isHasDiscountCard() { return hasDiscountCard; }

    // setters
    public void setFullName(String fullName) { this.fullName = fullName; }
    public void setTotalSpent(double totalSpent) { this.totalSpent = totalSpent; }
    public void setBonusPoints(int bonusPoints) { this.bonusPoints = bonusPoints; }
    public void setHasDiscountCard(boolean hasDiscountCard) { this.hasDiscountCard = hasDiscountCard; }

    //additional methods 2

    //1 проверка на его статус лояльности
    public boolean isLoyalCustomer() {
        return this.totalSpent > 20000;
    }

    // метод 2 начислять бонусы
    public void earnPoints(double purchaseAmount) {
        this.bonusPoints += (int) (purchaseAmount * 0.1);
        this.totalSpent += purchaseAmount;
    }

    //tostring method
    @Override
    public String toString() {
        return "Customer{fullName='" + fullName + "', totalSpent=" + totalSpent +
                ", bonusPoints=" + bonusPoints + ", discountCard=" + hasDiscountCard + "}";
    }
}
