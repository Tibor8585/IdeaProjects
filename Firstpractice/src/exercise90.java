import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercise90 {
    public static void main(String[] args) {
        System.out.println("Give me an item: ");
        Scanner scan = new Scanner(System.in);
        List<String> shoppingList = new ArrayList<>();
        for(int i = 0; i<3; i++){
            String product = scan.nextLine();
           shoppingList.add(product);
        }
        String products = convertToString(shoppingList);
        writeToFile(products);

    }

    public static String convertToString(List<String> LocalShoppingList){
        String result = "";
        for (String products: LocalShoppingList){
            result+= products + (", ");
        }
        return result;
    }
    public static void writeToFile(String content){
        try {
            Files.write(Paths.get("shoppinglist.txt"), content.getBytes("UTF-8"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
