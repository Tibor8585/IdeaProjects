import java.util.Scanner;
public class practiceTryCatch {
    public static void main(String[] args) {
        System.out.println("Program execution started.");

        Scanner scan = new Scanner(System.in);

        try {
            System.out.println(args[1]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("No luck with array handling from program arguments: " + ex);
        }

        try {
            int number = Integer.parseInt(scan.next());
        } catch (NumberFormatException ex) {
            System.out.println("No luck with user input from console. Because they said not int:" + ex);
        }

        System.out.println("Program execution end.");


        System.out.println("Program execution started");
        try {

            System.out.println(args[1]);
        }catch (Exception e){
            System.out.println("No luck " + e);
        }

        System.out.println("Program execution end");
    }
}
