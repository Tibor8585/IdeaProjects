import java.time.LocalDate;

public class exercise97dayTime {
    public static void main(String[] args) {
       // LocalDate matchDay = LocalDate.of(2024, 01, 06);
        LocalDate matchDay = LocalDate.parse("2024-01-06"); //Formátum: yyy-MMM-dd String formátumban

        /*
        LocalDate matcDay2 =  matchDay.plusDays(7);
        System.out.println(matcDay2); */

        int i = 1;
        while (i <=12){
            System.out.println("Match " + i + ". " + matchDay);
            matchDay = matchDay.plusDays(7);
            i++;
        }
    }
}
