import java.util.Scanner;

public class exercise78 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a String: ");
        String string = scanner.nextLine();
        System.out.println("Give me a second String: ");
        String contain = scanner.nextLine();
        boolean answer = isContains(string,contain);
        System.out.println(answer);

    }
    public static boolean isContains(String localString, String localContain){
        String localS = localString;
        String localC = localContain;
        if(localS.startsWith(localC)){
            System.out.println("Ez a szöveg szerepel benne.");
            return true;
        }else {
            return false;
        }
    }
}
