import java.util.Scanner;

public class exercise20a {
    public static void main(String[] args) {
        System.out.println("Add meg az életkorod:");
        Scanner scan = new Scanner(System.in);
        int userAge;
        do {
            userAge = scan.nextInt();
        } while (userAge <= 0);
        System.out.println("Az életkorod " + userAge);
    }
}