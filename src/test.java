

public class test {
    public static void main(String[] args) {
        double valuationMultiple = ValuationMultiple.calculate(500.0, 25.0);
        System.out.println("Valuation Multiple: " + valuationMultiple);

        double peRatio = PERatio.calculate(100.0, 5.0);
        System.out.println("P/E Ratio: " + peRatio);

        double pegRatio = PEGRatio.calculate(peRatio, 10.0);
        System.out.println("PEG Ratio: " + pegRatio);
        
        double propertyTax = PropertyTax.calculate(500.0, 25.0);
        System.out.println("Property Tax: " + propertyTax);
        
        double salesTax = SalesTax.calculate(200.0, 125.0);
        System.out.println("Sales Tax: " + salesTax);
        
        double rentToPrice = RentToPriceRatio.calculate(300.0, 15.0);
        System.out.println("Rent to Price Ratio: " + rentToPrice);

        double depreciation = Depreciation.calculate(100.0,200.0,100.0);
        System.out.println("Depreciation: " + depreciation);

    }
}
