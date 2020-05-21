public class Application {
    public static void main(String[] args) {
        SSF ssf = new SSF();
        BTT btt = new BTT();
        NBT nbt = new NBT();
        VAT vat = new VAT();
        TAX tax = new TAX();

        tax.setSuccessor(vat);
        vat.setSuccessor(nbt);
        nbt.setSuccessor(btt);
        btt.setSuccessor(ssf);

        Invoice invoice1 = new Invoice(1,50);
        System.out.println(tax.applyTax(invoice1));
        System.out.println(tax.applyAccumulativeTax(invoice1));

        Invoice invoice2 = new Invoice(2,150);
        System.out.println(tax.applyTax(invoice2));
        System.out.println(tax.applyAccumulativeTax(invoice2));

        Invoice invoice3 = new Invoice(3,250);
        System.out.println(tax.applyTax(invoice3));
        System.out.println(tax.applyAccumulativeTax(invoice3));

        Invoice invoice4 = new Invoice(4,350);
        System.out.println(tax.applyTax(invoice4));
        System.out.println(tax.applyAccumulativeTax(invoice4));

        Invoice invoice5 = new Invoice(5,450);
        System.out.println(tax.applyTax(invoice5));
        System.out.println(tax.applyAccumulativeTax(invoice5));

        Invoice invoice6 = new Invoice(6,550);
        System.out.println(tax.applyTax(invoice6));
        System.out.println(tax.applyAccumulativeTax(invoice6));
    }
}
