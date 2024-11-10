package quantify;



public class MortgagePayment {

    public static double calculateMortgagePayment(double principal, double annualInterestRate, int numberOfPayments) {
        double monthlyInterestRate = annualInterestRate / 100 / 12;
        return (principal * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments));
    }
}
