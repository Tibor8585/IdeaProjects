import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class exercise55 {
    public static void main(String[] args) {
        Map<String, Integer> shoppingList = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        boolean wantmore = true;

        while (wantmore) {
            System.out.println("Termék neve: ");
            String product = scanner.nextLine();
            System.out.println("Mennyisége: ");
            int amount = scanner.nextInt();
            if (shoppingList.containsKey(product)) {
                System.out.println("Az elem darabszáma frissítésre került");
            }
            shoppingList.put(product, amount);
            System.out.println(shoppingList);

            if(shoppingList.size()>=3) {
                System.out.println("Adsz hozzá még? Y: yes N: no");
                String válasz = scanner.nextLine();
                if (válasz.toUpperCase().equals("N")) {
                    wantmore = false;
                }
            }
        }
    }
    }
