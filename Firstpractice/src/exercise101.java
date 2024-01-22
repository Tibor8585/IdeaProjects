import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class exercise101 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        try {
            LocalDate date = LocalDate.parse(input);
            System.out.println("Valid date");
        }catch (DateTimeParseException ex){
            System.out.println("Invalid date");
        }

    }
}
