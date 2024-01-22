import java.util.InputMismatchException;
import java.util.Scanner;

public class exercise85home {
    public static void main(String[] args) {
        System.out.println(getNumberFromConsole());
    }
    public static int getNumberFromConsole() {
        Scanner scan = new Scanner(System.in);
        int number = 0;
        try {
            number = scan.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("You added a string, only number please");

        }
        return number;
    }
}
