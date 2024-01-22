import java.util.InputMismatchException;
import java.util.Scanner;

public class exercise85 {
    public static void main(String[] args) {
        System.out.println(getNumberFromConsole());

    }
    public static int getNumberFromConsole(){
        Scanner scan = new Scanner(System.in);
        int number = 0;
        try {
            number = scan.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Szöveget adtál meg szám helyett");
        }
        return number;
    }
}
