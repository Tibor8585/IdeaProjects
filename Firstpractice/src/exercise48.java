import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class exercise48 {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();
        Scanner scan = new Scanner(System.in);

        for (int i=0; i<7; i++){
            System.out.println("Gyümölcs: ");
            String fruit = scan.nextLine();
            fruits.add(fruit);
            System.out.println(fruits);
        }
        System.out.println("A kedvenc gyümölcseim: ");
        for (String fruit : fruits){
            System.out.println(fruit);
        }
    }
}
