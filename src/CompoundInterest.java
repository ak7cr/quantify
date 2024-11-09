


public class CompoundInterest {


    public static double calculateCompoundInterest(double principal, double annualInterestRate, int timesCompoundedPerYear, int years) {
       
        double rate = annualInterestRate / 100;

        
        double amount = principal * Math.pow(1 + (rate / timesCompoundedPerYear), timesCompoundedPerYear * years);

        return amount;
    }
}