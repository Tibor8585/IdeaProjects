import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercise90new {
    public static void main(String[] args) {
        List<String> shoppingList = getShoppingListFromUser();
        String content = transformListToString(shoppingList);
        writeToFile(content);

        //writeToFile(transformListToString(getShoppingListFromUser()));
    }

    public static List<String> getShoppingListFromUser() {
        Scanner scanner = new Scanner(System.in);
        List<String> shoppingList = new ArrayList<>();

        while (shoppingList.size() != 3) {
            System.out.println("Give me an item: ");
            String item = scanner.nextLine();
            shoppingList.add(item);
        }
        System.out.println("Data to write to file: " + shoppingList);
        return shoppingList;
    }

    public static String transformListToString(List<String> list) {
        String content = "";
        for (String item : list) {
            content += item + ", ";
        }
        return content;
    }

    public static void writeToFile(String content) {
        try {
            Files.write(Paths.get("shoppinglist.txt"), content.getBytes(StandardCharsets.UTF_8));  //felülírja a fájl tartalmát ha van már benne valami
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
