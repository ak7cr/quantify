

public class TrackingError {

    public static double calculate(double[] portfolioReturns, double[] benchmarkReturns) {
        if (portfolioReturns.length != benchmarkReturns.length) {
            throw new IllegalArgumentException("The portfolio and benchmark must have the same number of returns.");
        }

        double sumSquaredDifferences = 0;
        for (int i = 0; i < portfolioReturns.length; i++) {
            double difference = portfolioReturns[i] - benchmarkReturns[i];
            sumSquaredDifferences += Math.pow(difference, 2);
        }

        return Math.sqrt(sumSquaredDifferences / portfolioReturns.length);
    }
}
