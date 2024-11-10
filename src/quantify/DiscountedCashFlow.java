package quantify;




public class DiscountedCashFlow {

    public static double caculate(double[] cashFlows, double discountRate) {
        double result = 0;
        for (int t = 0; t < cashFlows.length; t++) {
            result += cashFlows[t] / Math.pow(1 + discountRate, t + 1);
        }
        return result;
    }
}
