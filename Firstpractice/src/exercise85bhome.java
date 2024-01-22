import java.util.InputMismatchException;
import java.util.Scanner;

public class exercise85bhome {
    public static void main(String[] args) {
        try {
            getNumberFromConsole();
        }catch (InputMismatchException e){
            System.out.println("Szöveget adtál meg szám helyett");
        }
    }
    public static int getNumberFromConsole() throws InputMismatchException {
    Scanner scan = new Scanner(System.in);
    int number = scan.nextInt();
    return number;
}
}
