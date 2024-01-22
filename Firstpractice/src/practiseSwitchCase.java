import java.util.Scanner;

public class practiseSwitchCase {
    public static void main(String[] args) {
        System.out.println("Legkedvesebb barátom neve:");
        Scanner scan = new Scanner(System.in);
        String friend = scan.next();

        switch (friend){
            case "Pista":
                System.out.println("Gratula Pista a legjobb barátom.");
                break;
            case "Józska":
                System.out.println("Gratula Józska is a legjobb barátom.");
                break;
            default:
                System.out.println("Hát nem.");
        }
    }
}
