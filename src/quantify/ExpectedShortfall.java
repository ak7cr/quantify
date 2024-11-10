package quantify;




public class ExpectedShortfall {

    public static double calculate(double[] portfolioReturns, double valueAtRisk) {
        double totalLosses = 0;
        int count = 0;

        for (double returnVal : portfolioReturns) {
            if (returnVal < valueAtRisk) {
                totalLosses += returnVal;
                count++;
            }
        }

        return totalLosses / count;
    }
}
