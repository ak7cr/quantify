package quantify;




public class EarningsPerShare {

    public static double calculate(double netIncome, double preferredDividends, double sharesOutstanding) {
        return (netIncome - preferredDividends) / sharesOutstanding;
    }
}
