public class NBT extends Handler{
    @Override
    public double applyTax(Invoice invoice) {
        invoice.setTax(invoice.getTax()+invoice.getAmount()*0.02);
        System.out.println("NBT calculated");
        if(invoice.getAmount()<=200){
            return invoice.getTax();
        }
        else {
            return successor.applyTax(invoice);
        }
    }

    @Override
    public double applyAccumulativeTax(Invoice invoice) {
        invoice.setAmount(invoice.getAmount()+invoice.getAmount()*0.02);
        System.out.println("NBT calculated");
        if(invoice.getAmount()<=200){
            return invoice.getTax();
        }
        else {
            return successor.applyTax(invoice);
        }
    }
}
