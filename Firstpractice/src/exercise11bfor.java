import java.util.Scanner;

public class exercise11bfor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int c = 0;


        for(String currentInput; !((currentInput=scanner.next()).equals("x"));c++){
            int currentInputAsInt = Integer.parseInt(currentInput);
            sum = sum + currentInputAsInt;
        }
        System.out.println("Az összeg:" + sum);
        System.out.println("ciklusszám:" + c);
    }
}
