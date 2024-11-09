


public class TreynorRatio {

    public static double calculate(double portfolioReturn, double riskFreeRate, double beta) {
        return (portfolioReturn - riskFreeRate) / beta;
    }
}
