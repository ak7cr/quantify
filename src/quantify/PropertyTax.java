package quantify;



public class PropertyTax {

    public static double calculate(double propertyValue, double taxRate) {
        return propertyValue * (taxRate / 100);
    }
}
