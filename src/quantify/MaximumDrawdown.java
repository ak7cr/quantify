package quantify;



public class MaximumDrawdown {

    public static double calculate(double[] portfolioReturns) {
        double peak = portfolioReturns[0];
        double maxDrawdown = 0;

        for (double portfolioReturn : portfolioReturns) {
            if (portfolioReturn > peak) {
                peak = portfolioReturn;
            }
            double drawdown = (peak - portfolioReturn) / peak;
            if (drawdown > maxDrawdown) {
                maxDrawdown = drawdown;
            }
        }

        return maxDrawdown;
    }
}
