import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        System.out.println("Várja az inputot");
        Scanner scan = new Scanner(System.in); // Utasítás, hogy a felhasználó tudjon a consoleval interakciót végezni
        String userData = scan.next(); // LEtároljuk a userData változóba a felhasználó által bevit adatokat

        System.out.println("stored data: " + userData);
    }
}
