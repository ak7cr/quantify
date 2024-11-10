package quantify;




public class EnterpriseValue {

    public static double calculate(double marketCap, double totalDebt, double cashAndCashEquivalents) {
        return marketCap + totalDebt - cashAndCashEquivalents;
    }
}
