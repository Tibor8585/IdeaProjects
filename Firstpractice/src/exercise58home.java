import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class exercise58home {
    public static void main(String[] args) {
        List<String> voteList = Arrays.asList("Salt", "Platán", "42", "Essencia", "Babel", "Borkonyha", "Costes", "42", "Borkonyha", "Rumour", "Platán", "Babel", "Stand", "Rumour", "Salt", "Platán", "42", "Rumour", "Rumour", "Borkonyha", "Rumour", "Borkonyha", "Babel", "Essencia", "Salt", "Platán", "Borkonyha", "42", "Babel", "Essencia", "42", "Stand", "Salt", "Costes", "42", "42", "Costes", "Stand", "Borkonyha", "Stand", "Costes", "Babel", "Essencia", "Stand", "Salt", "Platán", "Costes", "Salt", "Platán", "Salt", "Platán", "Essencia", "Rumour", "Salt", "Platán", "Rumour", "Stand", "Salt", "Essencia", "Babel", "Babel", "Essencia", "Rumour", "Essencia", "Salt", "Platán", "Borkonyha", "Stand", "Essencia", "Rumour", "Borkonyha", "Costes", "Babel", "Costes", "Salt", "Platán", "Essencia", "Stand", "Costes", "Borkonyha", "Essencia", "42", "Essencia", "42", "Stand", "Rumour", "Salt", "Platán", "Rumour", "Borkonyha", "Stand", "Babel", "Rumour", "Stand", "Salt", "Essencia", "Costes", "Costes", "42", "42", "Salt", "Platán", "Essencia", "Babel", "Costes", "Rumour", "Costes", "Stand", "Rumour", "Essencia", "Borkonyha", "Salt", "Platán", "Rumour", "Borkonyha", "42", "Babel", "Stand", "42", "Costes", "42", "Salt", "42", "Salt", "Essencia", "Borkonyha", "Essencia", "Borkonyha", "Rumour");

        Map<String, Integer> voteMap = new ConcurrentHashMap<>();

        for(String vote : voteList){
        if (voteMap.containsKey(vote)){
            int voteNumber = voteMap.get(vote);
            voteMap.put(vote, voteNumber + 1);
        }else{
            voteMap.put(vote, 1);
        }
    }

        for (Map.Entry mapElement: voteMap.entrySet()){
            System.out.println("A szavazatok alakulása: " + mapElement.getKey() + "-" + mapElement.getValue() + " szavazat.");
        }
        System.out.println("Az összes étterem száma: " + voteMap.size());
        System.out.println("Az összes szavazat száma: " + voteList.size());
        voteMap.remove("Essencia");

        int newWotes = voteMap.get("Stand") + 11;
        voteMap.put("Stand", newWotes);
        System.out.println(voteMap);
    }
}
