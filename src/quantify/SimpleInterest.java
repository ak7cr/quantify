package quantify;



public class SimpleInterest {

   
    public static double calculate(double principal, double annualInterestRate, int years) {
       
        double rate = annualInterestRate / 100;

      
        double interest = principal * rate * years;

        return interest;
    }

}