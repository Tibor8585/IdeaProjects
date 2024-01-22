import java.util.Scanner;

public class exercise11a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int c = 0;
        while (true){
            String currentInput = scanner.nextLine();
            if (currentInput.equals("x")){
                break;
            }
            int currentInputAsInt = Integer.parseInt(currentInput);
            sum = sum + currentInputAsInt;
            c++;
        }
        System.out.println("Az összeg: " + sum);
        System.out.println("A ciklusszám:" + c);
    }
}
