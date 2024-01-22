import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercise43b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> shoppingList= new ArrayList<>();
        System.out.println("Mi a termék?");
        String product= sc.nextLine();
        while(true){
            shoppingList.add(product);
            if (shoppingList.contains(product)){
                System.out.println("Ez már szerepel a listában.");
            }
            if (shoppingList.contains("x")){

            }
        }
        // System.out.println("A választott termékek: " +shoppingList);
    }
}
