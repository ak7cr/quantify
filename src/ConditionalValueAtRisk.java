


public class ConditionalValueAtRisk {

    public static double caculate(double portfolioValue, double valueAtRisk, double confidenceLevel) {
        return valueAtRisk + ((1 - confidenceLevel) * portfolioValue);
    }
}
