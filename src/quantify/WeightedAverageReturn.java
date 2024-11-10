package quantify;



public class WeightedAverageReturn {

    public static double calculate(double[] assetReturns, double[] assetWeights) {
        double weightedAverageReturn = 0;
        for (int i = 0; i < assetReturns.length; i++) {
            weightedAverageReturn += assetReturns[i] * assetWeights[i];
        }
        return weightedAverageReturn;
    }
}
