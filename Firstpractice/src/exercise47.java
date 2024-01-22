import java.util.Arrays;
import java.util.List;

public class exercise47 {
    public static void main(String[] args) {
        int voteToRumour = 0;
        int voteToBabel = 0;
        List<String> voteList = Arrays.asList("Rumour", "Babel", "Babel", "Babel", "Babel", "Babel", "Babel", "Babel", "Babel", "Babel", "Babel", "Babel", "Babel", "Rumour", "Babel", "Babel", "Rumour", "Rumour", "Rumour", "Babel", "Babel", "Rumour", "Rumour", "Rumour", "Babel", "Rumour", "Rumour", "Rumour", "Rumour", "Rumour", "Rumour", "Babel", "Rumour", "Rumour", "Rumour", "Babel", "Babel", "Rumour", "Rumour", "Rumour", "Rumour");

        for(String name : voteList){
            if(name.equals("Rumour")){
                voteToRumour++;
            }else if(name.equals("Babel")){
                voteToBabel++;
            }
        }
        if (voteToBabel<voteToRumour){
            System.out.println("A Rumour nyert.");
        }else if(voteToBabel>voteToRumour){
            System.out.println("A Babel nyert.");
        }else {
            System.out.println("Döntetlen.");
        }
    }
}
