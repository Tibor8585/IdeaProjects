import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


public class exercise93 {
    public static void main(String[] args) {
        List <String> voteList = readFromFile("src/resources/restaurant.txt");
        Map<String, Integer> voteMap = new ConcurrentHashMap<>();
        for(String place: voteList){
            if (voteMap.containsKey(place)) {
                int originValue = voteMap.get(place);
                voteMap.put(place, originValue + 1);
            }else{
                voteMap.put(place, 1);
            }
        }
        for (Map.Entry mapElement : voteMap.entrySet()) {
            System.out.println(mapElement.getKey() + " - " + mapElement.getValue() + " darab");
        }
        System.out.println("Az összes szavazat száma: " + voteList.size());
        System.out.println("Az éttermek száma: " + voteMap.size());
        voteMap.remove("Essencia");

        String contentFile = "";
        contentFile+= "Az összes szavazat száma: " + voteList.size() + System.lineSeparator();
        contentFile+= "Az éttermek száma: " + voteMap.size() + System.lineSeparator();
        writeToFile(contentFile);

        for (Map.Entry mapElement : voteMap.entrySet()) {
           /* if ((mapElement.getKey() + "").equals("Essencia")){   Ez valamiért szar.
                voteMap.remove(mapElement);
            } */
            if ((mapElement.getKey() + "").equals("Stand")){
                voteMap.put(mapElement.getKey() + "",24);
            }
        }
        System.out.println(voteMap);
    }
    public static List<String> readFromFile(String localRestaurantList){
        List<String>lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(Paths.get(localRestaurantList));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return lines;
    }
    public static void writeToFile(String voteList){
        try {
            Files.write(Paths.get("savedFiles/restaurantsVoteCount.txt"), voteList.getBytes("UTF-8"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    }

