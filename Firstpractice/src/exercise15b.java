import java.util.Random;
import java.util.Scanner;

public class exercise15b {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Kérem az első játékos nevét:");
        String player1Name = scan.nextLine();

        System.out.println("Kérem a második játékos nevét:");
        String player2Name = scan.nextLine();
        int player1Sum = 0;
        int player2Sum = 0;
        Random randomGenerator = new Random();

        int round = 0;
        while(round <= 3){
            int player1ActualNumber = randomGenerator.nextInt(1, 7);
            System.out.println(player1Name + " dob.");
            System.out.println(player1Name + " " + player1ActualNumber + " dobott.");

            int player2ActualNumber = randomGenerator.nextInt(1, 7);
            System.out.println(player2Name + " dob.");
            System.out.println(player2Name + " " + player2ActualNumber + " dobott.");

            if (round == 3){
                player1Sum = player1Sum + player1ActualNumber*2;
                player2Sum = player2Sum + player2ActualNumber*2;
            }else{
                player1Sum = player1Sum + player1ActualNumber;
                player2Sum = player2Sum + player2ActualNumber;
            }
            System.out.println(player1Name + "eredménye a " + round + " körben: " + player1Sum);
            System.out.println(player2Name + "eredménye a " + round + " körben: " + player2Sum);
            round++;
        }
        if (player1Sum > player2Sum){
            System.out.println(player1Name + " nyert.");
        }else if(player1Sum < player2Sum){
            System.out.println(player2Name + " nyert.");
        }else{
            System.out.println("Döntetlen.");
        }
    }
}
