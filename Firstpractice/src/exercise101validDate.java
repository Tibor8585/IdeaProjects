import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class exercise101validDate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String date = scan.nextLine();

        try {
            LocalDate dates = LocalDate.parse(date);
            System.out.println("Valid datetime " + dates);
        } catch (Exception ex) {
            System.out.println("Invalid datetime");
        }
    }
}
