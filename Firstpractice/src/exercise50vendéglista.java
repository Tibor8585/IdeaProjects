import java.nio.channels.ScatteringByteChannel;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class exercise50vendéglista {
    public static void main(String[] args) {
        Set<String> guestSet = new HashSet<>();
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        int guestNumber = 1;
        System.out.println("Hány vendég jön el a buliba: ");
        int numbersOfGuest = scan2.nextInt();
        do {
            System.out.println("Vendég neve " + guestNumber + "." + ": ");
            String guests = scan.nextLine();
            guestSet.add(guests);
            guestNumber++;
        }while (guestNumber<=numbersOfGuest);
        System.out.println(guestSet);

    }
}
