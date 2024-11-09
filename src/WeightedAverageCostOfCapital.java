

public class WeightedAverageCostOfCapital {

    public static double calculateWACC(double equity, double debt, double costOfEquity, double costOfDebt, double taxRate) {
        double totalValue = equity + debt;
        double weightedCostOfEquity = (equity / totalValue) * costOfEquity;
        double weightedCostOfDebt = (debt / totalValue) * costOfDebt * (1 - taxRate);
        return weightedCostOfEquity + weightedCostOfDebt;
    }
}
