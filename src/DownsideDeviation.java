


public class DownsideDeviation {

    public static double calculate(double[] assetReturns, double minimumAcceptableReturn) {
        double downsideVariance = 0;
        int count = 0;
        for (double assetReturn : assetReturns) { 
            if (assetReturn < minimumAcceptableReturn) {
                downsideVariance += Math.pow(assetReturn - minimumAcceptableReturn, 2);
                count++;
            }
        }
        return count > 0 ? Math.sqrt(downsideVariance / count) : 0;  
    }
}
