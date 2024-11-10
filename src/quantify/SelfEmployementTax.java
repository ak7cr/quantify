package quantify;



public class SelfEmployementTax {

    public static double calculate(double netSelfEmploymentIncome) {
        double selfEmploymentTaxRate = 15.3; // 12.4% for Social Security + 2.9% for Medicare
        return netSelfEmploymentIncome * (selfEmploymentTaxRate / 100);
    }
}
