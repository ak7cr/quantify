


public class ConditionalDrawdownAtRisk {

    public static double caculate(double[] portfolioReturns, double confidenceLevel) {
        double[] drawdowns = new double[portfolioReturns.length];
        double peak = portfolioReturns[0];

        for (int i = 0; i < portfolioReturns.length; i++) {
            if (portfolioReturns[i] > peak) {
                peak = portfolioReturns[i];
            }
            drawdowns[i] = (peak - portfolioReturns[i]) / peak;
        }

        return percentile(drawdowns, confidenceLevel);
    }

    private static double percentile(double[] values, double percentile) {
        int index = (int) Math.ceil(percentile * values.length) - 1;
        java.util.Arrays.sort(values);
        return values[index];
    }
}
