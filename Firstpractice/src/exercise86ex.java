import java.util.Scanner;

public class exercise86ex {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String words = scan.nextLine();

        try {
            processTo10(words);
        }catch (Exception e){
            System.out.println("Hiba, nincs 10. karakter.");
        }
    }
    public static void processTo10(String words) throws Exception{
        System.out.println(words.charAt(10));
    }
}
