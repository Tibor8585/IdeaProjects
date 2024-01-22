import java.util.Random;
import java.util.Scanner;

public class exercise23 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(5);
        String decision = "I";
while (decision.equals("I")) {
            switch (randomNumber) {
                case 0:
                    System.out.println("Ma szerencsés napod lesz");
                    break;
                case 1:
                    System.out.println("Ma találkozol egy kedves ismerőssel");
                    break;
                case 2:
                    System.out.println("Ma megtalálod életed szerelmét");
                    break;
                case 3:
                    System.out.println("Sok pénz áll ma a házhoz");
                    break;
                case 4:
                    System.out.println("Ma egy új lehetőség nyílik meg előtted");
                    break;
            }
        }
        System.out.println("Akarsz új kívánságot? I/N.");
        Scanner scan = new Scanner(System.in);
        decision = scan.next();
    }
}