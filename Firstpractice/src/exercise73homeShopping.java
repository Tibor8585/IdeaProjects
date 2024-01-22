import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class exercise73homeShopping {
    public static void main(String[] args) {
        List<String> shoppingList = new ArrayList<>();
        Map<String, Integer> shoppingMap = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        int sumOfAmounts = 0;
        String product = "";
        shoppingList.add(product);
        do {
            System.out.println("Adja meg a vásárolni kívánt terméket (az alábbi formátumban: tétel-db): ");
            product = scan.nextLine();
            if(!product.equalsIgnoreCase("x")){
                    String[] dataArray = product.split("-");
                    String productName = dataArray[0];
                    int productAmount = Integer.parseInt(dataArray[1]);
                    sumOfAmounts += productAmount;
                    shoppingMap.put(productName, productAmount);
            }
        }while (!product.equalsIgnoreCase("x"));


            System.out.println(shoppingMap.size());
            System.out.println(sumOfAmounts);

        }
    }

