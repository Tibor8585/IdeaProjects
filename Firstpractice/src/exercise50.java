import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class exercise50 {
    public static void main(String[] args) {
        Set<String>guestList = new HashSet<>();
        Scanner scan = new Scanner(System.in);
        for (int i=1; i <=11; i++){
            System.out.println("A vendég neve: ");
            String guest= scan.nextLine();
            guestList.add(guest);
        }
        System.out.println("A meghívott vendégek: " + guestList);
    }
}
