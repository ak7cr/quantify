


public class Depreciation {

    public static double calculate(double costBasis, double salvageValue, double usefulLife) {
        return (costBasis - salvageValue) / usefulLife;
    }
}
