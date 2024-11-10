package quantify;




public class CreditCardInterest {

    public static double caculate(double averageDailyBalance, double annualInterestRate, int daysInBillingCycle) {
       
        double dailyInterestRate = annualInterestRate / 100 / 365;

      
        double interest = averageDailyBalance * dailyInterestRate * daysInBillingCycle;

        return interest;
    }

}
