

public class SharpeRatio {

    public static double calculate(double portfolioReturn, double riskFreeRate, double standardDeviation) {
        return (portfolioReturn - riskFreeRate) / standardDeviation;
    }
}
