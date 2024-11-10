package quantify;




public class DividendYield {

    public static double calculateDividendYield(double annualDividends, double currentMarketPrice) {
        return (annualDividends / currentMarketPrice) * 100;
    }
}
