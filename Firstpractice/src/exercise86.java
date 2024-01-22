import java.util.Scanner;

public class exercise86 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String words = scan.nextLine();
        try {
            System.out.println(words.charAt(10));
        }catch (Exception e){
            System.out.println("Hiba, nincs 10. karakter.");
        }

    }
}
