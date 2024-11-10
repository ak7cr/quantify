package quantify;




public class Duration {

    public static double calculate(double faceValue, double couponRate, int periods, double discountRate) {
        double duration = 0.0;
        double price = BondPrice(faceValue, couponRate, periods, discountRate);
        double couponPayment = faceValue * couponRate;

        for (int t = 1; t <= periods; t++) {
            duration += t * (couponPayment / Math.pow(1 + discountRate, t));
        }

        duration += periods * (faceValue / Math.pow(1 + discountRate, periods));
        return duration / price;
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
