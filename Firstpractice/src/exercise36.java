public class exercise36 {
    public static void main(String[] args) {
        int[] eggPrices = {10, 20, 40, 50, 70};
        double sum = 0;
        for (int i = 0; i < eggPrices.length; i++) {
            sum = eggPrices[i] + sum;
        }
        System.out.println(sum/eggPrices.length);
    }
}
