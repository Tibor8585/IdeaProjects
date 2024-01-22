import java.util.HashMap;
import java.util.Map;

public class practiseMap {
    public static void main(String[] args) {
        Map<String, String>randomNames2=new HashMap<>();;
        randomNames2.put("456ERT","Tibor2");
        randomNames2.put("456ERJ","Tibor");
        System.out.println(randomNames2.size());
        System.out.println(randomNames2.get("456ERJ"));
        System.out.println(randomNames2.containsKey("456ERJ"));
        System.out.println(randomNames2.containsValue("Tibor"));
        System.out.println(randomNames2.remove("456ERJ"));
        System.out.println(randomNames2.get("456ERJ"));
        System.out.println(randomNames2);
        Map<String, Integer>randomAges=new HashMap<>();
        randomAges.put("456EFR",37);
        randomAges.put("456EFT",44);
        randomAges.put("456EFS",27);
        System.out.println(randomAges);

        System.out.println("------for each----------------------------------------");
        for (Map.Entry mapElement: randomAges.entrySet()){
            System.out.println(mapElement.getKey() + " " + mapElement.getValue());
            if (mapElement.getKey().equals("456EFR")){
                System.out.println("Megvan.");
            }
        }
    }
}

