import java.util.Scanner;

public class exercise20 {
    public static void main(String[] args) {
        System.out.println("Add meg az életkorod:");
        Scanner scan = new Scanner(System.in);
        int userAge = 0;

        while (userAge <= 0){
           userAge = scan.nextInt();
        }
        System.out.println("A életkorod " + userAge);
    }
}
