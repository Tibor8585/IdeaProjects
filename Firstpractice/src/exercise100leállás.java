import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class exercise100leállás {
    public static void main(String[] args) {
        List<String> logs = Arrays.asList("07:17", "07:04", "07:48", "07:36", "07:52",
                "07:12", "07:43", "07:45", "08:11", "07:53", "08:32", "07:44",
                "07:51", "08:49", "08:41", "07:56", "07:12", "07:15", "07:47",
                "07:56", "08:52", "07:24", "07:22", "07:05", "08:32", "07:32",
                "07:54", "07:04", "17:13", "17:07", "18:55", "07:14", "07:48",
                "08:19", "08:53", "08:50", "08:32", "07:47", "07:48", "08:41"
        );
        List<LocalTime> dateList = new ArrayList<>();
        for (String time : logs) {
            LocalTime date = LocalTime.parse(time);
            dateList.add(date);
        }
        int morningLogs = 0, afternoonLogs = 0;

        LocalTime noon = LocalTime.of(12, 00);
        for (LocalTime dates : dateList) {
            if (dates.isBefore(noon)) {
                morningLogs++;
            } else if (dates.isAfter(noon)) {
                afternoonLogs++;
            }
        }
        System.out.println("Az összes leállás száma: " + dateList.size());
        System.out.println("A délelőtti leállások száma: " + morningLogs);
        System.out.println("A délutáni leállások száma: " + afternoonLogs);
    }
}
