import java.util.Scanner;
import java.util.Random;
public class exercise65 {
    public static void main(String[] args) {
     String userHand = getUserhand();
        if (userHand.equals("ROCK") || userHand.equals("SCISSORS") || userHand.equals("PAPER")) {
            String computerHand = getComputerHand();
            printToWin(userHand, computerHand);

        } else {
            System.out.println("It's not a valid option. Please restart the program and choose from ROCK/SCISSORS/PAPER.");
        }
    }
    public static String getUserhand(){
        System.out.println("Program started and wait for input ROCK/SCISSORS/PAPER: ");
        Scanner scan = new Scanner(System.in);
        String userData = scan.next();
        userData = userData.toUpperCase();  //változó tartalmának felülírása annak nagybetűs változatával
        System.out.println("stored data after standardization: " + userData);
        System.out.println("Great, good luck.");
        return userData;
    }
    public static String getComputerHand(){
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

        return computerChoose;
    }
    public static void printToWin(String userHand,String computerHand){
        if (userHand.equals("ROCK") && computerHand.equals("SCISSORS")) {
            System.out.println("Player win!");
        } else if (userHand.equals("PAPER") && computerHand.equals("ROCK")) {
            System.out.println("Player win!");
        } else if (userHand.equals("SCISSORS") && computerHand.equals("PAPER")) {
            System.out.println("Player win!");
        } else if (userHand.equals(computerHand)) {
            System.out.println("Draw!");
        } else {
            System.out.println("Computer win");
        }
    }
}
