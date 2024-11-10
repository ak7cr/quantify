package quantify;




public class DebtCoverageRatio {

    public static double calculateDCR(double netOperatingIncome, double totalDebtService) {
        return netOperatingIncome / totalDebtService;
    }
}
