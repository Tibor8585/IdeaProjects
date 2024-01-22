import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class PractiseDateTimeMilis {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis()); //1970-től eltelt ezred milisecundomok

        LocalDate now = LocalDate.now();   //elkéri az aktuális időt a futás pillanatában
        LocalDate firstDayOfThisYear = now.withDayOfYear(100);    //az aktuális év 100-adik napjának dátuma
        DayOfWeek dayOfWeek = firstDayOfThisYear.getDayOfWeek();  //milyen nap volt az aktuális napon
        System.out.println(now.plusDays(1));
        System.out.println("First day of this year: " + dayOfWeek);
        System.out.println("First day of next year: " + now.plusYears(1).withDayOfYear(1).getDayOfWeek());

        LocalTime lunchStart = LocalTime.parse("12:00");
        LocalTime lunchEnd = LocalTime.of(13, 0);
        LocalTime nowTime = LocalTime.now();
        System.out.println(nowTime);
        if (!lunchStart.isAfter(nowTime) && nowTime.isBefore(lunchEnd)) {
            System.out.println("Lunch time");
        } else {
            System.out.println("It's not lunch time");
        }


        LocalDateTime nowDateTime = LocalDateTime.now();
        System.out.println("Before Formatting: " + nowDateTime);
        DateTimeFormatter customFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String formatDateTime = nowDateTime.format(customFormat);
        System.out.println("After Formatting: " + formatDateTime);
    }
}
