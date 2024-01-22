import java.util.Scanner;

public class exercise2b {
    public static void main(String[] args) {
        System.out.println("Give me the number a:");
        Scanner scan = new Scanner(System.in); // Utasítás, hogy a felhasználó tudjon a consoleval interakciót végezni
        String userDataA = scan.next(); //

        System.out.println("Give me the number b:");
        scan = new Scanner(System.in); // Utasítás, hogy a felhasználó tudjon a consoleval interakciót végezni
        String userDataB = scan.next(); //

        int a = Integer.parseInt(userDataA);
        int b = Integer.parseInt(userDataB);
        System.out.println(a%b);
    }
}
