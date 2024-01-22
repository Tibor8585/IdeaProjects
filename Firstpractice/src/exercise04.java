import java.util.Random;
import java.util.Scanner;

public class exercise04 {
    public static void main(String[] args) {
        System.out.println("Please give 0 in case of heads or give 1 in case of tails: ");
        Scanner scan = new Scanner(System.in);
        String userDataA = scan.next();
        int userChoose = Integer.parseInt(userDataA);
        if (userChoose ==0 || userChoose ==1){
            System.out.println("Input saved");
        }else{
            System.out.println("Invalid input");
        }
        Random random = new Random();
        int computerCoint = random.nextInt(2);

        if(userChoose == computerCoint){
            System.out.println("You nailed it!");
        }else{
            System.out.println("No luck");
        }

    }
}
