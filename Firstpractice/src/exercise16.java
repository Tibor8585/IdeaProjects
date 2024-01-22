import java.util.Random;
import java.util.Scanner;

public class exercise16 {
    public static void main(String[] args) {
        System.out.println("Add meg, hogy KŐ/PAPÍR/OLLÓ: ");
        Scanner scan = new Scanner(System.in);
        String userData = scan.next();
        // String userData = scan.next().toUpperCase(); // Egyből nagybetűssé
        System.out.println("Stored data: " + userData);
        System.out.println(userData.toUpperCase());
        userData = userData.toUpperCase();

        if (userData.equals("KŐ") || userData.equals("PAPÍR") || userData.equals("OLLÓ")) {
            System.out.println("Great, good luck");
        } else {
            System.out.println("Ez nem választható, válassz mást.");
        }
        Random random = new Random();
        int randomNumber = random.nextInt(1, 4);
        String computerChoose = "";
        /*if (randomNumber == 1) {
            computerChoose = "KŐ";
        } else if (randomNumber == 2) {
            computerChoose = "PAPÍR";
        } else if (randomNumber == 3) {
            computerChoose = "OLLÓ";
        } */
        switch (randomNumber){
            case 1:
                computerChoose = "KŐ";
                break;
            case 2:
                computerChoose = "PAPÍR";
                break;
            case 3:
                computerChoose = "OLLÓ";
                break;

        }
        System.out.println("A számítógép választása: " + computerChoose);
        if(userData.equals("KŐ") && computerChoose.equals("PAPÍR")){
            System.out.println("Nyertél!");
        }else if(userData.equals("PAPÍR") && computerChoose.equals("KŐ")){
            System.out.println("Nyertél!");
        }else if(userData.equals("OLLÓ") && computerChoose.equals("PAPÍR")){
            System.out.println("Nyertél!");
        }else if(userData.equals(computerChoose)){
            System.out.println("Döntetlen!");
        }
        else {
            System.out.println("Vesztettél!");
        }
    }
}
