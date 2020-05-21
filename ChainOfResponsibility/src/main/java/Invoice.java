public class Invoice {
    private int invoiceNumber;
    private double tax;
    private double amount;

    Invoice(int invoiceNumber, double amount){
        this.invoiceNumber = invoiceNumber;
        this.amount = amount;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public void setAmount(double amount){
        this.amount = amount;
    }

    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public double getTax() {
        return tax;
    }

    public double getAmount() {
        return amount;
    }
}
