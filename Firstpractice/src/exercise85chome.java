import java.util.InputMismatchException;
import java.util.Scanner;

public class exercise85chome {
    public static void main(String[] args) {
        boolean answer = true;
        while (answer) {
            try {
                System.out.println(getNumberFromConsole());
                answer = false;
            } catch (InputMismatchException e) {
                System.out.println("Szöveget adtál meg szám helyett");
                answer = true;
            }
        }
    }
    public static int getNumberFromConsole() throws InputMismatchException {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        return number;
    }
}
