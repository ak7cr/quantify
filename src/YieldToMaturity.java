

public class YieldToMaturity {

    public static double calculate(double bondPrice, double faceValue, double couponRate, int periods) {
        double lowerBound = 0.0;
        double upperBound = 1.0;
        double ytm = (lowerBound + upperBound) / 2.0;

        while (Math.abs(BondPrice(faceValue, couponRate, periods, ytm) - bondPrice) > 1e-6) {
            if (BondPrice(faceValue, couponRate, periods, ytm) > bondPrice) {
                lowerBound = ytm;
            } else {
                upperBound = ytm;
            }
            ytm = (lowerBound + upperBound) / 2.0;
        }

        return ytm;
    }

    private static double BondPrice(double faceValue, double couponRate, int periods, double discountRate) {
        double price = 0.0;
        double couponPayment = faceValue * couponRate;

        for (int t = 1; t <= periods; t++) {
            price += couponPayment / Math.pow(1 + discountRate, t);
        }

        price += faceValue / Math.pow(1 + discountRate, periods);
        return price;
    }
}
