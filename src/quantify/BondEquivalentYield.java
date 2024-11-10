package quantify;




public class BondEquivalentYield {

    public static double caculate(double faceValue, double bondPrice, int daysToMaturity) {
        return ((faceValue - bondPrice) / bondPrice) * (365.0 / daysToMaturity);
    }
}
