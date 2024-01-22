import java.util.ArrayList;
import java.util.List;

public class exeercise69 {
    public static void main(String[] args) {
        List<String>fruits=getFruitList();
        printFruitListWithFor(fruits);
        printFruitListWithForEach(fruits);
    }
    public static List<String> getFruitList(){
        List<String> favFruits = new ArrayList<>();
        favFruits.add("Apple");
        favFruits.add("Banana");
        favFruits.add("Melon");
        favFruits.add("Mano");
        favFruits.add("Orange");
        return favFruits;
    }
    public static void  printFruitListWithFor(List<String> favFruit){
        for (int i = 0; i < favFruit.size(); i++) {
            System.out.println(favFruit.get(i));
        }


    }
    public static void  printFruitListWithForEach(List<String> favFruit){
        for (String fruit : favFruit) {
            System.out.println(fruit);
        }
    }
}
