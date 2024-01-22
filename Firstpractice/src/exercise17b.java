import java.util.Random;
import java.util.Scanner;

public class exercise17b {
    public static void main(String[] args) {
        System.out.println("Program started and wait for input ROCK/SCISSORS/PAPER: ");
        Scanner scan = new Scanner(System.in);
        String userData = "";
        int computerScore= 0;
        int playerScore = 0;

        while (!(userData.equals("X"))) {
            System.out.println("ROUND started.");
            userData = scan.next();
            userData = userData.toUpperCase();  //változó tartalmának felülírása annak nagybetűs változatával
            System.out.println("stored data after standardization: " + userData);
            if (userData.equals("ROCK") || userData.equals("SCISSORS") || userData.equals("PAPER")) {
                System.out.println("Great, good luck.");
                Random random = new Random();
                int randomNumber = random.nextInt(1, 4);   //1,2,3

                String computerChoose = "";
                switch (randomNumber) {
                    case 1:
                        computerChoose = "ROCK";
                        break;
                    case 2:
                        computerChoose = "SCISSORS";
                        break;
                    case 3:
                        computerChoose = "PAPER";
                        break;
                }
                System.out.println("Computer hand: " + computerChoose);

                //megvizsgáljuk a userData változót, hogyan viszonyul a computerChoose változóhoz annak eldöntésére, hogy ki nyert
                if (userData.equals("ROCK") && computerChoose.equals("SCISSORS")) {
                    playerScore += 3;

                    System.out.println("Player win!");
                } else if (userData.equals("PAPER") && computerChoose.equals("ROCK")) {
                    System.out.println("Player win!");
                    playerScore += 3;

                } else if (userData.equals("SCISSORS") && computerChoose.equals("PAPER")) {
                    System.out.println("Player win!");
                    playerScore += 3;

                } else if (userData.equals(computerChoose)) {
                    System.out.println("Draw!");
                    playerScore += 1;
                    computerScore += 1;

                } else {
                    System.out.println("Computer win");
                    computerScore += 3;

                }
            } else {
                System.out.println("It's not a valid option. Please restart the program and choose from ROCK/SCISSORS/PAPER.");
            }
            System.out.println("A játékos eredménye a kör után: " + playerScore);
            System.out.println("A gép eredménye a kör után: " + computerScore);

        }
        System.out.println("A játékos eredménye a kör után: " + playerScore);
        System.out.println("A gép eredménye a kör után: " + computerScore);
    }
}
