import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class exercise56 {
    public static void main(String[] args) {
        Map<String, Integer> amounts = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        Scanner sc2 =  new Scanner(System.in);

        int counter = 1;
        int sumOfAccount=0;

        do {
            System.out.println("Type of account: ");
            String account= sc.nextLine();
            System.out.println("amount of account: ");
            int amount = sc2.nextInt();
            amounts.put(account,amount);
            if (amounts.containsValue(0)){
                System.out.println("Amount will be removed.");
                amounts.remove(account,amount);
            }
            sumOfAccount+=amount;
            counter++;
        }while (counter<=3);
        System.out.println("You have the following amounts: " + amounts + "." + "You have to pay: " + sumOfAccount + "Ft.");
    }
}
