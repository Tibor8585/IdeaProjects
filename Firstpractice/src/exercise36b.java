import java.util.Scanner;

public class exercise36b {
    public static void main(String[] args) {
        // int[] eggPrices = {10, 20, 40, 50, 70};
        int[] eggPrices =new int[5];
        System.out.println("Add meg a tojások árát!");
        Scanner sc = new Scanner(System.in);
        eggPrices[0]= sc.nextInt();
        eggPrices[1]= sc.nextInt();
        eggPrices[2]= sc.nextInt();
        eggPrices[3]= sc.nextInt();
        eggPrices[4]= sc.nextInt();

        double sum = 0;
        for (int i = 0; i < eggPrices.length; i++) {
            sum = eggPrices[i] + sum;
        }
        System.out.println(sum/eggPrices.length);
    }
}
