import java.util.Scanner;

public class exercise36c {
    public static void main(String[] args) {
        // int[] eggPrices = {10, 20, 40, 50, 70};
        Scanner sc = new Scanner(System.in);
        System.out.println("Hány tojás árát szeretné rögzíteni?");
        int numberOfEggs=sc.nextInt();
        int[] eggPrices =new int[numberOfEggs];
        System.out.println("Add meg a tojások árát!");
        for (int i=0; i<numberOfEggs; i++){
            eggPrices[i]= sc.nextInt();
        }

        double sum = 0;
        for (int i = 0; i < eggPrices.length; i++) {
            sum = eggPrices[i] + sum;
        }
        System.out.println(sum/eggPrices.length);
    }
}
