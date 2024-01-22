import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class exercise54 {
    public static void main(String[] args) {
        Map<String, String> phoneBook=new HashMap<>();
        Scanner scanner= new Scanner(System.in);

        do {
            System.out.println("Add meg a neved: ");
            String name = scanner.nextLine();
            System.out.println("Add meg a telefonszámod: ");
            String number = scanner.nextLine();
            phoneBook.put(name, number);
            System.out.println(phoneBook);
        }while (phoneBook.size() !=5);
    }
}
