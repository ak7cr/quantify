package quantify;



public class ValueAtRisk {

    public static double calculate(double portfolioValue, double confidenceLevel, double portfolioStdDev) {
        double zScore = getZScore(confidenceLevel); // Use standard normal distribution table for z-scores
        return portfolioValue * zScore * portfolioStdDev;
    }

    private static double getZScore(double confidenceLevel) {
        if (confidenceLevel == 0.99) {
            return 2.33;
        } else if (confidenceLevel == 0.95) {
            return 1.65;
        } else if (confidenceLevel == 0.90) {
            return 1.28;
        } else {
            throw new IllegalArgumentException("Confidence level not supported");
        }
    }
}
