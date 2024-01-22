import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercise43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> shoppingList= new ArrayList<>();
        int productCounter=1;
        int sizeOfList=7;

        while(productCounter<=sizeOfList){
            System.out.println("Mi az " + productCounter + " termék?");
            shoppingList.add(sc.nextLine());
            productCounter++;
    }

        System.out.println("A választott termékek: " +shoppingList);
    }
}
