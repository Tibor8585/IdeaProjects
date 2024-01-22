import java.util.InputMismatchException;
import java.util.Scanner;

public class exercise85b {
        public static void main(String[] args) {
           int result = 0;
           boolean nextRoundNeded=true;
           while(nextRoundNeded){
               try {
                   result = getNumberFromConsole();
                   nextRoundNeded = false;
               } catch (InputMismatchException e) {
                   nextRoundNeded = true;
                   System.out.println("Szöveget adtál meg szám helyett");
               }
           }
            System.out.println(result);
        }

        public static int getNumberFromConsole() throws InputMismatchException{
            Scanner scan = new Scanner(System.in);
            int number = 0;
            number = scan.nextInt();
            return number;
        }
    }

