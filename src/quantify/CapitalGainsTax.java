package quantify;




public class CapitalGainsTax {

    public static double calculateCapitalGainsTax(double capitalGains, double taxRate) {
        return capitalGains * (taxRate / 100);
    }
}

