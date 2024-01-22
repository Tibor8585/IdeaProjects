import java.time.LocalDate;

public class exercise97foci {
    public static void main(String[] args) {
       // LocalDate matchDay = LocalDate.of(2024,01,07);
        LocalDate nextDate = LocalDate.parse("2024-01-07");
      //  LocalDate nextDate = matchDay.plusDays(7);
       // System.out.println(nextDate);

        int i = 1;
        while (i<=12){
            nextDate = nextDate.plusDays(7);
            System.out.println("A(z) " + i + " mérkőzés dátuma: " + nextDate);
            i++;
        }
    }
}
