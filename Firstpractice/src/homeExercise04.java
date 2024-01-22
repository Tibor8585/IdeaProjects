import java.util.Random;
import java.util.Scanner;

public class homeExercise04 {
    public static void main(String[] args) {
        System.out.println("Adj meg egy számot, ha az értéke 0-3 közé esik a válaszod: fej. Haz általad mondot szám 4-7 között van, a válaszod: írás");
        Scanner numberChoice = new Scanner(System.in);
        String choice = numberChoice.next();
        int coin = Integer.parseInt(choice);
        if (coin <= 3){
            System.out.println("A választásod fej, mivel az általad mondot szám: " + coin);
        }else {
            System.out.println("A választásod írás, mivel az általad mondot szám: " + coin);
        }
        Random random = new Random();
        int randomNumber = random.nextInt(8);
        if (randomNumber <= 3 && coin <= 3) {
            System.out.println("Az eredmény fej, mivel a kapott szám: " + randomNumber);
        } else {
            System.out.println("Az eredmény írás, mivel a kapott szám: " + randomNumber);
        }
    }
}
