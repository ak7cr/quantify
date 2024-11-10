package quantify;



public class PERatio {
    public static double calculate(double price, double earnings) {
        if (earnings == 0) {
            throw new IllegalArgumentException("Earnings cannot be zero.");
        }
        return price / earnings;
    }
}
