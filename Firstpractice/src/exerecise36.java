import java.util.Scanner;

public class exerecise36 {
    public static void main(String[] args) {
        int[] eggPrices = new int [8];
        double eggPricesSum=0;
        Scanner sc = new Scanner(System.in);

        for(int i=0; i <eggPrices.length; i++){
            System.out.println("Mennyi az ára?");
            eggPrices[i]= sc.nextInt();
            eggPricesSum+=eggPrices[i];
        }
        for (int i=0;i < eggPrices.length; i++){
            eggPricesSum=eggPricesSum+=eggPrices[i];
        }
        System.out.println("Avg:" + (eggPricesSum/eggPrices.length));
    }
}
