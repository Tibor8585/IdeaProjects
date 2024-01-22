import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class exercise100 {
    public static void main(String[] args) {
        List<String> logs = Arrays.asList(
                "07:17", "07:04", "07:48", "07:36", "07:52",
                "07:12", "07:43", "07:45", "08:11", "07:53", "08:32", "07:44",
                "07:51", "08:49", "08:41", "07:56", "07:12", "07:15", "07:47",
                "07:56", "08:52", "07:24", "07:22", "07:05", "08:32", "07:32",
                "07:54", "07:04", "17:13", "17:07", "18:55", "07:14", "07:48",
                "08:19", "08:53", "08:50", "08:32", "07:47", "07:48", "08:41"
        );
        List<LocalTime> logsLocalTime = new ArrayList<>();
        int before12 = 0, after12 = 0;
        for (String log : logs) {
            LocalTime time = LocalTime.parse(log);
            logsLocalTime.add(time);
        }
        for (LocalTime  stop : logsLocalTime){
            LocalTime noon = LocalTime.parse("12:00");
           if (stop.isBefore(noon)){
               before12++;
           }else {
               after12++;
           }
        }
        System.out.println("Leállások száma: " + logsLocalTime.size());
        System.out.println("Délelőtti leállás: " + before12);
        System.out.println("Délutáni leállás: " + after12);
    }
}
