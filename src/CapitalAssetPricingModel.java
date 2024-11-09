


public class CapitalAssetPricingModel {

    public static double calculateCAPM(double riskFreeRate, double beta, double marketReturn) {
        return riskFreeRate + beta * (marketReturn - riskFreeRate);
    }
}

