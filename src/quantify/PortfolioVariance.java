package quantify;



public class PortfolioVariance {

    public static double calculate(double[] assetWeights, double[][] covarianceMatrix) {
        double portfolioVariance = 0;
        for (int i = 0; i < assetWeights.length; i++) {
            for (int j = 0; j < assetWeights.length; j++) {
                portfolioVariance += assetWeights[i] * assetWeights[j] * covarianceMatrix[i][j];
            }
        }
        return portfolioVariance;
    }
}
