import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;
import java.util.concurrent.ConcurrentHashMap;

public class exercise92bookio {
    public static void main(String[] args) {
        List<String> bookList = readFromFile();
        String bookMap = booksCount(bookList);
        readToFile(bookMap);
    }

    public static List<String> readFromFile() {
        List<String> lines = null;
        try {
            lines = Files.readAllLines(Paths.get("src/resources/book2.txt"));

        } catch (IOException e) {
            System.out.println("NEM LÉTEZIK");
        }
        return lines;
    }

    public static String booksCount(List<String> booksList) {
        Map<String, Integer> booksmap = new ConcurrentHashMap<>();
        String result = "";
        for (String book : booksList) {
            if (booksmap.containsKey(book)) {
                int originValue = booksmap.get(book);
                booksmap.put(book, originValue + 1);
            } else {
                booksmap.put(book, 1);
            }
        }
        for (Map.Entry mapElement : booksmap.entrySet()) {
            System.out.println(mapElement.getKey() + " - " + mapElement.getValue() + " darab");
        }
        result+= "Az összes könyv száma: " + booksList.size() + System.lineSeparator();
        result+= "Count of books with different titles: " + booksmap.size() + System.lineSeparator();

        return result;

    }
    public static void readToFile(String content){
        try {
            Files.write(Paths.get("savedFiles/booksCount2.txt"), content.getBytes("UTF-8"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
