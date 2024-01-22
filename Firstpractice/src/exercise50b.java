import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class exercise50b {
    public static void main(String[] args) {
        Set<String> guestList = new HashSet<>();
        Scanner scan = new Scanner(System.in);
        Scanner scan2= new Scanner(System.in);
        System.out.println("Hány vendéget szeretnél meghívni:");
        int partySize = scan.nextInt();

        while (guestList.size() !=partySize) {
            System.out.println("A vendég neve: ");
            String guest = scan2.nextLine();
            guestList.add(guest);
        }
        System.out.println("A meghívott vendégek: " + guestList);
    }
}