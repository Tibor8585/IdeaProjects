import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercise43d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> shoppingList= new ArrayList<>();

        String currentImput="";

        while(!(currentImput.toLowerCase().equals("x"))){
            System.out.println("Mi a termék?");
            currentImput = sc.nextLine();
            if (currentImput.toLowerCase().equals("x")){
                break;
            }
            if(!shoppingList.contains(currentImput)) {
                shoppingList.add(currentImput);
            }else{
                System.out.println("Ez az elem már hozzáadásr került.");
            }
        }

        System.out.println("A választott termékek: " +shoppingList);
        System.out.println("Melyik elemet szeretné törölni: ");
        currentImput = sc.nextLine();
        shoppingList.remove(currentImput);
        System.out.println("A választott termékek: " +shoppingList);
    }
}
