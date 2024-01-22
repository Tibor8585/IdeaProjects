import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class exercise93home {
    public static void main(String[] args) {
       List<String> voteList = filereading();
       String result = restaurantsVoteCount(voteList);
       writeToFile(result);

    }

    public static List <String> filereading(){
        List<String> restaurants = new ArrayList<>();
        try {
            restaurants = Files.readAllLines(Paths.get("src/resources/restaurant.txt"));

            } catch (IOException e) {
            System.out.println("NEM LÉTEZIK");
        }
        return restaurants;
    }
    public static String  restaurantsVoteCount(List<String> voteList){

        Map<String, Integer> voteMap = new ConcurrentHashMap<>();

        for(String vote : voteList){
            if (voteMap.containsKey(vote)){
                int voteNumber = voteMap.get(vote);
                voteMap.put(vote, voteNumber + 1);
            }else{
                voteMap.put(vote, 1);
            }
        }
        String resultText="";
        for (Map.Entry mapElement: voteMap.entrySet()){
            System.out.println("A szavazatok alakulása: " + mapElement.getKey() + "-" + mapElement.getValue() + " szavazat.");
        }
        voteMap.remove("Essencia");

        int newWotes = voteMap.get("Stand") + 11;
        voteMap.put("Stand", newWotes);
        resultText = "Az összes étterem száma: " + voteMap.size() + System.lineSeparator();
        resultText+="Az összes szavazat száma: " + voteList.size() + System.lineSeparator();

        return resultText;

    }
    public static void writeToFile(String result){
        String content = result;
        try {
            Files.write(Paths.get("savedFiles/restaurantsVoteCount2.tx"), content.getBytes("UTF-8"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
