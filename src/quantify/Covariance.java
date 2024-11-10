package quantify;




public class Covariance {

    public static double caculate(double[] asset1Returns, double[] asset2Returns) {
        double mean1 = 0, mean2 = 0;
        for (int i = 0; i < asset1Returns.length; i++) {
            mean1 += asset1Returns[i];
            mean2 += asset2Returns[i];
        }
        mean1 /= asset1Returns.length;
        mean2 /= asset2Returns.length;

        double covariance = 0;
        for (int i = 0; i < asset1Returns.length; i++) {
            covariance += (asset1Returns[i] - mean1) * (asset2Returns[i] - mean2);
        }
        return covariance / (asset1Returns.length - 1);
    }
}
