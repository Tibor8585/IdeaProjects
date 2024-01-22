import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class exercise99munkaerkezes {
    public static void main(String[] args) {
        List<String> logs = Arrays.asList("07:38", "07:53", "07:17", "07:04", "07:48", "07:36", "07:52",
                "07:12", "07:43", "07:45", "08:11", "07:53", "08:32", "07:44",
                "07:19", "07:54", "07:36", "08:39", "07:22", "08:58", "07:23",
                "07:40", "07:22", "07:06", "07:56", "07:26", "08:09", "07:30",
                "07:51", "08:49", "08:41", "07:56", "07:12", "07:15", "07:47",
                "07:14", "08:40", "07:50", "07:06", "07:39", "08:16", "07:26",
                "07:56", "08:52", "07:24", "07:22", "07:05", "08:32", "07:32",
                "07:54", "07:04", "07:13", "07:07", "08:55", "07:14", "07:48",
                "08:19", "08:53", "08:50", "08:32", "07:47", "07:48", "08:41",
                "08:15", "07:20", "07:29", "08:39", "07:58", "07:17", "07:18"
        );
        List<LocalTime> localTimeList = new ArrayList<>();
        for (String log : logs) {
            LocalTime time = LocalTime.parse(log);
            localTimeList.add(time);
        }

        int countTimeBetween7and8 = 0, countTimeBetween8and9 = 0, countTimeBetween9and10 = 0, countTimeBetween10and11 = 0;

        for (LocalTime arive : localTimeList){
        if (arive.getHour() == 7) {
            countTimeBetween7and8++;
        }else if (arive.getHour() == 8){
            countTimeBetween8and9++;
        }else if (arive.getHour()==9){
            countTimeBetween9and10++;
        }else if(arive.getHour()==10){
            countTimeBetween10and11++;
        }
        }
        System.out.println("7-8 között érkezette: " + countTimeBetween7and8);
        System.out.println("8-9 között érkezette: " + countTimeBetween8and9);
        System.out.println("9-10 között érkezette: " + countTimeBetween9and10);
        System.out.println("10-11 között érkezette: " + countTimeBetween10and11);
    }
}

