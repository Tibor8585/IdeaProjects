import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class exercise57 {
    public static void main(String[] args) {
        List<String> booksList = Arrays.asList("Son", "Harry Potter VI.", "Down and Out in Paris and London", "All about Sam", "1984", "Keep the Aspidistra Flying", "The Fellowship of the Ring", "Keep the Aspidistra Flying", "A Summer to Die", "Harry Potter V", "The Return of the King", "Harry Potter VI.", "The Return of the King", "Down and Out in Paris and London", "Harry Potter V", "A Summer to Die", "Harry Potter I.", "Harry Potter III.", "All about Sam", "Animal Farm", "Gathering Blue", "Homage to Catalonia", "Son", "The Two Towers", "Harry Potter III.", "Messenger", "The Return of the King", "Homage to Catalonia", "Harry Potter III.", "Harry Potter I.", "The Two Towers", "Gathering Blue", "Messenger", "The Fellowship of the Ring", "1984", "Harry Potter VI.", "Keep the Aspidistra Flying", "Gathering Blue", "Harry Potter V", "Harry Potter II.", "Homage to Catalonia", "Harry Potter V", "Animal Farm", "All about Sam", "Son"
        );
        System.out.println(booksList);
        Map<String, Integer> booksmap = new ConcurrentHashMap<>();
        for (String book : booksList) {
            if (booksmap.containsKey(book)) {
                int originValue = booksmap.get(book);
                booksmap.put(book, originValue + 1);
            } else {
                booksmap.put(book, 1);
            }

        }
        //   System.out.println(booksmap);

        for (Map.Entry mapElement : booksmap.entrySet()) {
            System.out.println(mapElement.getKey() + " - " + mapElement.getValue() + " darab");
        }
        System.out.println("Az összes könyv száma: " + booksList.size());
        System.out.println("Count of books with different titles: " + booksmap.size());

        for (Map.Entry mapElement : booksmap.entrySet()) {
            if ((mapElement.getValue() + "").equals("1")){
                booksmap.remove(mapElement.getKey());

            }
            if((mapElement.getValue() + "").equals("4")){
                booksmap.put(mapElement.getKey() + "",3);
        }

        }
    }
}