import java.util.HashMap;
import java.util.Map;

public class Exercise53map {
    public static void main(String[] args) {
        Map<String, Integer> fruits=new HashMap<>();
        fruits.put("Alma",2);
        fruits.put("Banán",3);
        fruits.put("Ananász",1);
        fruits.put("Körte",1);
        for (Map.Entry mapElement: fruits.entrySet()) {
            System.out.println(mapElement.getKey() + " " + mapElement.getValue());
        }
        }
    }

