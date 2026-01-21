public class Sale {
    // private fields
    private int transactionId;
    private String productName;
    private double amount;
    private String status;

    //constructures with parameters
    public Sale(int transactionId, String productName, double amount, String status) {
        this.transactionId = transactionId;
        this.productName = productName;
        this.amount = amount;
        this.status = status;
    }

    //default
    public Sale() {
        this.transactionId = 0;
        this.productName = "Unknown";
        this.amount = 0.0;
        this.status = "Pending";
    }

    // getters
    public int getTransactionId() { return transactionId; }
    public String getProductName() { return productName; }
    public double getAmount() { return amount; }
    public String getStatus() { return status; }

    //setter
    public void setTransactionId(int transactionId) { this.transactionId = transactionId; }
    public void setProductName(String productName) { this.productName = productName; }
    public void setAmount(double amount) { this.amount = amount; }
    public void setStatus(String status) { this.status = status; }


    // additional method min 2
    public void completeSale() {
        this.status = "Completed";
    }

    public void applyTax(double taxRate) {
        this.amount += this.amount * (taxRate / 100);
    }

    //toSting
    @Override
    public String toString() {
        return "Sale{id=" + transactionId + ", product='" + productName +
                "', amount=" + amount + ", status='" + status + "'}";
    }
}
