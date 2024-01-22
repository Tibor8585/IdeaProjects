import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class exerecise47 {
    public static void main(String[] args) {
        List<String> restaurantVotes = Arrays.asList("Rumour", "Babel", "Babel","Babel", "Babel","Babel", "Babel","Babel", "Babel","Babel", "Babel","Babel", "Babel","Rumour","Babel", "Babel", "Rumour","Rumour", "Rumour","Babel", "Babel", "Rumour","Rumour", "Rumour", "Babel", "Rumour", "Rumour", "Rumour", "Rumour", "Rumour", "Rumour", "Babel", "Rumour","Rumour", "Rumour","Babel", "Babel", "Rumour", "Rumour", "Rumour", "Rumour");
    int counterBabel= 0;
    int counterRomour= 0;
        for (String vote: restaurantVotes){
            if (restaurantVotes.equals("Romour")){
                counterRomour++;
            }else {
                counterBabel++;
            }
    }
        if (counterBabel<counterRomour){
            System.out.println("A győztes: Romour");
        }else System.out.println("A győztes:Babbel");
    }
}
