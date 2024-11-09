


public class Alpha {

    public static double calculate(double portfolioReturn, double riskFreeRate, double beta, double marketReturn) {
        return portfolioReturn - (riskFreeRate + beta * (marketReturn - riskFreeRate));
    }
}
