import java.util.Scanner;

public class exercise76 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a String: ");
        String string = scanner.nextLine();
        String result = string.trim();
        if (string.length() == 0) {
            System.out.println("Hiba!");
        } else {
            System.out.println("Átalakított változó- :" + result + " -");

        }
    }
}

