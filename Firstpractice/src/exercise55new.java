import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class exercise55new {
    public static void main(String[] args) {
        Map<String, Integer> shoppingList = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        boolean answer = true;
        while (answer) {
            System.out.println("Termék neve: ");
            String product = scan.nextLine();
            System.out.println("Termék darabszáma: ");
            int amount = scan2.nextInt();
            if (shoppingList.containsKey(product)) {
                System.out.println("Az elem darabszáma frissítésre került.");
            }
            shoppingList.put(product, amount);
            System.out.println(shoppingList);
            if (shoppingList.size() >= 3) {
                System.out.println("Adsz hozzá még? I: igen N: nem");
                String choice = scan.nextLine();
                if (choice.toUpperCase().equals("I")) {
                    answer=true;
                }else { answer=false;};

            }

        }
        System.out.println("A vásárolni kívánt termékek: " + shoppingList);
    }
}
