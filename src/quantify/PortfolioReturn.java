package quantify;



public class PortfolioReturn {

    public static double calculate(double[] assetReturns, double[] assetWeights) {
        double portfolioReturn = 0;
        for (int i = 0; i < assetReturns.length; i++) {
            portfolioReturn += assetReturns[i] * assetWeights[i];
        }
        return portfolioReturn;
    }
}
