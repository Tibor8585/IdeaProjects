import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class exercise52 {
    public static void main(String[] args) {
        Set<Integer> randomNumbers = new HashSet<>();
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int setSize = 3;


        while (randomNumbers.size() < setSize) {
            int rndNumbers = random.nextInt(0, 3);
            randomNumbers.add(rndNumbers);
        }
        int numberOfTry = 0;
        while (!(randomNumbers.isEmpty())) {
            System.out.println("Tippelj egy számot?");
            int answer = scan.nextInt();
            if (randomNumbers.remove(answer)){
                if (randomNumbers.size()!=0) {
                    System.out.println("Szép próbálkozás! " + randomNumbers.size() + "szám maradt.");
                }
            }
            numberOfTry++;
            }
        System.out.println("Gratulálunk! Próbálkozásaid száma: " + numberOfTry);
        }
    }
