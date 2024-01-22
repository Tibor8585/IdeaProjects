import java.util.Scanner;
public class exercise68 {
    public static void main(String[] args) {
        int eggCount = getNumberOfEgs();
        int[] eggArray = getFilledEggsArrayWithPrice(eggCount);
        int eggSum=getCalculatedSum(eggArray);
        printCalculatedAvg(eggSum, eggCount);
    }

    public static int getNumberOfEgs() {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many eggs you want to sum?");
        int numOfEggs = sc.nextInt();
        return numOfEggs;

    }

    public static int[] getFilledEggsArrayWithPrice(int localEggcount) {
        int eggCount = localEggcount;
        int[] eggPrices = new int[eggCount];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < eggPrices.length; i++) {
            System.out.println("What is the price?");
            eggPrices[i] = sc.nextInt();
        }
        return eggPrices;
    }
    public static int getCalculatedSum(int[] localArrayWithEggs){
        int[] arrayWithEggs = localArrayWithEggs;
        int eggPricesSum=0;
        for (int i = 0; i < arrayWithEggs.length; i++) {
            eggPricesSum = eggPricesSum + arrayWithEggs[i];
        }
        return eggPricesSum;
    }
    public static void printCalculatedAvg(int localEggsum, int eggCount){
        double eggSum=localEggsum;
        System.out.println("Avg:" + (eggSum / eggCount));
    }
}
