

public class ValueAddedTax {

    public static double calculateVAT(double netPrice, double taxRate) {
        return netPrice * (taxRate / 100);
    }
}
