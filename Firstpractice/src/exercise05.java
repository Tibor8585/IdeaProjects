import java.util.Random;
import java.util.Scanner;

public class exercise05 {
    public static void main(String[] args) {
        System.out.println("Adja meg a lehetséges nyertesek nevét.");
        Scanner scan = new Scanner(System.in);
        String userName1 = scan.next();
        scan = new Scanner(System.in);
        String userName2 = scan.next();
        scan = new Scanner(System.in);
        String userName3 = scan.next();
        scan = new Scanner(System.in);
        String userName4 = scan.next();
        scan = new Scanner(System.in);
        String userName5 = scan.next();
        scan = new Scanner(System.in);
        String userName6 = scan.next();
        scan = new Scanner(System.in);

        Random random = new Random();
        int winner = random.nextInt(6);

        if (winner==0){
            System.out.println("A győztes neve: " + userName1);
        }else if(winner==1){
            System.out.println("A győztes neve: " + userName2);
        }else if(winner==2) {
            System.out.println("A győztes neve: " + userName3);
        }else if(winner==3) {
            System.out.println("A győztes neve: " + userName4);
        }else if(winner==4) {
            System.out.println("A győztes neve: " + userName5);
        }else if(winner==5) {
            System.out.println("A győztes neve: " + userName6);
        }
    }
}
