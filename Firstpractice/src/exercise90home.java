import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercise90home {
    public static void main(String[] args) {
        List<String> products = readFromList();
        writeToFile(products);
    }
public static List readFromList(){
    List<String> shoppingList = new ArrayList<>();
    String list = "";
    do {
        System.out.println("Add items: ");
        Scanner scan = new Scanner(System.in);
        list = scan.nextLine();
        if (!list.equalsIgnoreCase("x")){
            shoppingList.add(list);
        }
    }while(!list.equalsIgnoreCase("x"));

    return shoppingList;
}

public static void writeToFile(List<String> localProducts){
        String productsToWrite = "";

        for(String shoppingProducts : localProducts){
           productsToWrite+= shoppingProducts + ", " + System.lineSeparator();
        }
    try {
        Files.write(Paths.get("savedFiles/newShoppingList"), productsToWrite.getBytes("UTF-8"), StandardOpenOption.APPEND);
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
}
}
