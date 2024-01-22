import java.util.Scanner;

public class exercise3b {
    public static void main(String[] args) {

        System.out.println("Give me the number a:");
        Scanner scan = new Scanner(System.in);
        String userDataA = scan.next();

        System.out.println("Give me the number b:");
        scan = new Scanner(System.in);
        String userDataB = scan.next();
        int a = Integer.parseInt(userDataA);
        int b = Integer.parseInt(userDataB);
        System.out.println("Result: " + a*3*b);
    }
}
