import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercise43bc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> shoppingList= new ArrayList<>();

        int sizeOfList=7;
        String currentImput="";

        while(!(currentImput.toLowerCase().equals("x"))){
            System.out.println("Mi a termék?");
            currentImput = sc.nextLine();
            if (currentImput.toLowerCase().equals("x")){
                break;
            }
            shoppingList.add(currentImput);
        }

        System.out.println("A választott termékek: " +shoppingList);
    }
}
