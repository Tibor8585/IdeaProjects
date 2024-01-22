import java.util.Random;
import java.util.Scanner;

public class exercise15 {
    public static void main(String[] args) {
        int i = 0;
        int player1Sum = 0;
        int player2Sum = 0;
        String player1Name = "";
        String player2Name = "";
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        System.out.println("Kérem az első játékos nevét:");
        player1Name = sc.nextLine();

        System.out.println("Kérem a második játékos nevét:");
        player2Name = sc.nextLine();

        while (i < 4){
          if (i % 2 ==0){
              System.out.println(player1Name + "dob");
              int n = r.nextInt(1, 7);
              System.out.println(player1Name + " " + n + "-t dobott.");
              player1Sum = player1Sum + n;
              System.out.println(player1Name + " eredménye:" + player1Sum);
          }else{
              System.out.println(player2Name + "dob");
              int n = r.nextInt(1, 7);
              System.out.println(player2Name + " " + n + "-t dobott.");
              player1Sum = player2Sum + n;
              System.out.println(player2Name + " eredménye:" + player2Sum);
          }
            i++;
        }
    }
}
