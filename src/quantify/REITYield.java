package quantify;



public class REITYield {

    public static double calculateREITYield(double annualDividend, double currentMarketPrice) {
        return (annualDividend / currentMarketPrice) * 100;
    }
}
