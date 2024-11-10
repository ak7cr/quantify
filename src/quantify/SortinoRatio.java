package quantify;



public class SortinoRatio {

    public static double calculate(double portfolioReturn, double riskFreeRate, double downsideDeviation) {
        return (portfolioReturn - riskFreeRate) / downsideDeviation;
    }
}
