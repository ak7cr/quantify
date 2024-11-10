package quantify;



public class OverdraftFees {

    public static double calculateOverdraftFees(int numberOfOverdrafts, double feePerOverdraft) {
        
        return numberOfOverdrafts * feePerOverdraft;
    }
}
