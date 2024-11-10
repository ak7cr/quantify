package quantify;



public class CreditUtilizationRatio {

 
    public static double calculateCreditUtilization(double totalCreditUsed, double totalCreditLimit) {
   
        return (totalCreditUsed / totalCreditLimit) * 100;
    }
}
