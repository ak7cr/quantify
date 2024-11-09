

public class TaxWithholding {

    public static double calculateTaxWithholding(double grossIncome, double withholdingRate) {
        return grossIncome * (withholdingRate / 100);
    }
}
