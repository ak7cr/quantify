package quantify;




public class EffectiveAnnualRate {

    
    public static double calculate(double nominalAnnualRate, int compoundingPeriodsPerYear) {
        
        double nominalRateDecimal = nominalAnnualRate / 100;

        
        double ear = Math.pow(1 + (nominalRateDecimal / compoundingPeriodsPerYear), compoundingPeriodsPerYear) - 1;

       
        return ear * 100;
    }
}