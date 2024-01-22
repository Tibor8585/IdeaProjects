import java.util.Scanner;

public class homeExercise03 {
    public static void main(String[] args) {
        System.out.println("Give me the number a:");
        Scanner scan = new Scanner(System.in);
        String userDataA = scan.next();

        System.out.println("Give me the number a:");
        scan = new Scanner(System.in);
        String userDataB = scan.next();
        int a = Integer.parseInt(userDataA);
        int b = Integer.parseInt(userDataB);
        System.out.println(a*b);
    }
}
