import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercise71 {
    public static void main(String[] args) {
        List <String> namesList = new ArrayList<>();
        String names = "";
        do {
            System.out.println("Addj meg egy nevet: ");
            Scanner scan = new Scanner(System.in);
            names = scan.nextLine();
            namesList.add(names.toLowerCase());
        }while (!names.equals("x"));
        namesList.remove("x");


        System.out.println(namesList);
    }

}
