

public class PEGRatio {

    /**
     * Method to calculate the PEG ratio.
     * 
     * @param peRatio - the P/E ratio of the company.
     * @param epsGrowthRate - the expected growth rate of the EPS.
     * @return PEG ratio calculated as P/E Ratio / EPS Growth Rate.
     */
    public static double calculate(double peRatio, double epsGrowthRate) {
        if (epsGrowthRate == 0) {
            throw new IllegalArgumentException("EPS Growth Rate cannot be zero");
        }
        return peRatio / epsGrowthRate;
    }
}
