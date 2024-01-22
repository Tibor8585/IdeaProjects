import java.time.LocalDate;

public class exercise98 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);
 /*
        int i = 1;
        while (i <10){
            System.out.println(now);
           now = now.plusMonths(1);
           i++;
        }  */
        int i = 0;
        while (i <9) {
            System.out.println(now.plusMonths(i));
            i++;
        }
    }
}
