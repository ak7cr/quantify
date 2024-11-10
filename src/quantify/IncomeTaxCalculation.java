package quantify;




public class IncomeTaxCalculation {

    public static double calculateIncomeTax(double taxableIncome, double taxRate) {
        return taxableIncome * (taxRate / 100);
    }
}
