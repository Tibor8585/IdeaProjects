import java.time.LocalDate;

public class exercise98home {
    public static void main(String[] args) {
        LocalDate actualDate = LocalDate.now();
        LocalDate nextDate = LocalDate.parse("2023-12-30");
        int cycle = 1;

        while (cycle <= 12){
       nextDate= nextDate.plusMonths(1);
            System.out.println("Az " + cycle + " meccs dátuma: " + nextDate);
            cycle++;
        }
    }
}
