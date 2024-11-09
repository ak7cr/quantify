

public class SalesTax {

    public static double calculate(double purchaseAmount, double taxRate) {
        return purchaseAmount * (taxRate / 100);
    }
}
