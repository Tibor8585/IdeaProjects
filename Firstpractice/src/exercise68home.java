import java.util.Scanner;
public class exercise68home {
    public static void main(String[] args) {
        int eggsNumber = numberOfEggs();
        int[] pricesOfEggs = eggPrices(eggsNumber);
        int[] readOfPrices = readOfEggPrices(pricesOfEggs);
        double eggpriceSum = eggPRiceSum(readOfPrices);
        average(eggpriceSum, pricesOfEggs);



    }

    public static int numberOfEggs() {
        System.out.println("How many eggs you want to sum?");
        Scanner sc = new Scanner(System.in);
        int numOfEggs = sc.nextInt();
        return numOfEggs;
    }

    public static int[] eggPrices(int localeggsNumber) {
        int[] eggPrices = new int[localeggsNumber];
        return eggPrices;
    }

    public static int[] readOfEggPrices(int[] eggPrices) {
        for (int i = 0; i < eggPrices.length; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("What is the price?");
            eggPrices[i] = sc.nextInt();
        }
        return eggPrices;
    }

    public static double eggPRiceSum(int[] eggPrices) {
        double eggPricesSum = 0;
        for (int i = 0; i < eggPrices.length; i++) {
            eggPricesSum = eggPricesSum + eggPrices[i];
        }
        return eggPricesSum;
    }
    public static void average(double eggPricesSum, int[]eggPrices){
        System.out.println("Avg:" + (eggPricesSum / eggPrices.length));
    }
}
