package quantify;




public class Convexity {

    public static double caculate(double faceValue, double couponRate, int periods, double discountRate) {
        double convexity = 0.0;
        double price = BondPrice(faceValue, couponRate, periods, discountRate);
        double couponPayment = faceValue * couponRate;

        for (int t = 1; t <= periods; t++) {
            convexity += (t * (t + 1)) * (couponPayment / Math.pow(1 + discountRate, t + 2));
        }

        convexity += (periods * (periods + 1)) * (faceValue / Math.pow(1 + discountRate, periods + 2));
        return convexity / price;
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
