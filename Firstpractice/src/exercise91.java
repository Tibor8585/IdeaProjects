import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class exercise91 {
    public static void main(String[] args) {
        List<String> list=readFromFile("actual-food-set.csv");
    analyseFoodList(list);
    }

    public static List<String> readFromFile(String fileName) {
        List<String> lines=new ArrayList<>();
        try {
            lines = Files.readAllLines(Paths.get(fileName));
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("NEM LÉTEZIK");
        }
        return lines;
    }
    public static void analyseFoodList(List<String> list){
        list.remove(0);
    for (String analyse: list){
      String[] foodArray = analyse.split(", ");
      String actualFood = foodArray[0];
      int actualAmount = Integer.parseInt(foodArray[1]);
      int requiredAmount = Integer.parseInt(foodArray[2]);
      if(actualAmount<=requiredAmount/2){
          System.out.println(actualFood + " amount is less than needed. You should buy " + (requiredAmount-actualAmount) + "to reach the required.");
     }
    }
    }

}
