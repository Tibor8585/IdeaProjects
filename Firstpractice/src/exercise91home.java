import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class exercise91home {
    public static void main(String[] args) {
        List<String> products =  readFromFile();
        amountCounter(products);
    }

    public static List<String> readFromFile(){
        List<String> shoppingList = new ArrayList<>();
        try {
            shoppingList = Files.readAllLines(Paths.get("src/resources/actual-food-set.csv"));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return shoppingList;
    }
    public static void amountCounter(List<String> products){
        products.remove(0);

        for(String counter : products){
            String[] ArrayProducts = counter.split(", ");
            String productName = ArrayProducts[0];
            int amount = Integer.parseInt(ArrayProducts[1]);
            int required = Integer.parseInt(ArrayProducts[2]);

            if (amount<=required/2){
                System.out.println(productName + " amount is less than needed. You should buy " + (required-amount) + " to reach the required.");

            }
        }
    }
}
