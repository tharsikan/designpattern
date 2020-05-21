public class TAX extends Handler{
    @Override
    public double applyTax(Invoice invoice) {
        return successor.applyTax(invoice);
    }

    @Override
    public double applyAccumulativeTax(Invoice invoice) {
        return successor.applyAccumulativeTax(invoice);
    }
}
