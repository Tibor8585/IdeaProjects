import java.util.InputMismatchException;
import java.util.Scanner;

public class exercise85bb {
    public static void main(String[] args) {
        boolean trueWay=true;
        while (trueWay) {
            try {
                System.out.println(getNumberFromConsole());
                trueWay = false;
            } catch (InputMismatchException e) {
                System.out.println("Szöveget adtál meg szám helyett");
                trueWay = true;
            }
        }

    }
    public static int getNumberFromConsole() throws InputMismatchException {
        Scanner scan = new Scanner(System.in);
        int number= scan.nextInt();
        return number;
    }
}
