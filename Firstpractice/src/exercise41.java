import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class exercise41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer>bills= new ArrayList<>();
        int sum =0;
        System.out.println("Electricity:");
        bills.add(sc.nextInt());

        System.out.println("Water:");
        bills.add(sc.nextInt());

        for(Integer bill: bills){
            sum += bill;
        }
        System.out.println("A számlád összege: " + sum);
    }
}
