package quantify;

 


public class LoanToValueRatio {

    public static double calculateLTV(double loanAmount, double propertyValue) {
        return (loanAmount / propertyValue) * 100;
    }
}
 