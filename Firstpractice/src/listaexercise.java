import java.util.ArrayList;
import java.util.List;

public class listaexercise {
    public static void main(String[] args) {
        List<String>fruit = new ArrayList<>();
        fruit.add("Banán");
        fruit.add("Alma");
        fruit.add("Körte");
        fruit.add("Szilva");
        for(String fav: fruit){
            System.out.println("My favorite fruits are: " + fav);
        }

    }
}
