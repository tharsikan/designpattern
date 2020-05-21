public class SSF extends Handler{
    @Override
    public double applyTax(Invoice invoice) {
        invoice.setTax(invoice.getTax()+invoice.getAmount()*0.04);
        System.out.println("SSF calculated");
        return invoice.getTax();
    }

    @Override
    public double applyAccumulativeTax(Invoice invoice) {
        invoice.setAmount(invoice.getAmount()+invoice.getAmount()*0.04);
        System.out.println("SSF calculated");
        return invoice.getTax();
    }
}
