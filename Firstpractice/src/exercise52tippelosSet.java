import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class exercise52tippelosSet {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        int randomNumber = 0;

        while (numbers.size()<=3) {
            randomNumber = random.nextInt(0, 4);
            numbers.add(randomNumber);
        }
        int numbersOfTipps = 0;
        int tippNumber = 0;
        while (!(numbers.isEmpty())){
            System.out.println("Adja meg tippjét: ");
            tippNumber = scan.nextInt();
            if(numbers.contains(tippNumber)){
                numbers.remove(tippNumber);
                int numbersSize = numbers.size();
                System.out.println("Talált! Még " + numbersSize + " találat kell.");
            }
            numbersOfTipps++;
        }
        System.out.println("Gratulálok " + numbersOfTipps + " találat kellett a sikerhez.");
    }
}
