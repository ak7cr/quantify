package quantify;



public class OperatingExpenseRatio {

    public static double calculateOER(double operatingExpenses, double grossOperatingIncome) {
        return (operatingExpenses / grossOperatingIncome) * 100;
    }
}
