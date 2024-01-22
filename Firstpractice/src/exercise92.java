import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
public class exercise92 {
    public static void main(String[] args) {
       List<String> booksList = readFromFile("src/resources/book.txt");
        Map<String, Integer> booksMap = new ConcurrentHashMap<>();

        // a solution
        System.out.println(booksList);
        for (String book : booksList) {
            if (booksMap.containsKey(book)) {
                int originValue = booksMap.get(book);
                booksMap.put(book, originValue + 1);
            } else {
                booksMap.put(book, 1);
            }
        }
        //System.out.println(booksMap);
        // a/b solution
        int sum = 0;
        for (Map.Entry mapElement : booksMap.entrySet()) {
            System.out.println(mapElement.getKey() + " - " + mapElement.getValue() + " darab");
            sum += Integer.parseInt(mapElement.getValue() + "");
        }
        System.out.println("Total count of books: " + booksList.size());
        System.out.println("Total count of books: " + sum);
        System.out.println("Count of books with different titles: " + booksMap.size());

        String contentFile= "";
        contentFile+= "Total count of books: " + booksList.size() + System.lineSeparator();
        contentFile+= "Total count of books: " + sum + System.lineSeparator();
        contentFile+= "Count of books with different titles: " + booksMap.size()  + System.lineSeparator();

        writeToFile(contentFile);

        // c/d solution

        for (Map.Entry mapElement : booksMap.entrySet()) {
            if ((mapElement.getValue() + "").equals("1")) {
                booksMap.remove(mapElement.getKey());
            }
            // d solution
            if ((mapElement.getValue() + "").equals("4")) {
                booksMap.put(mapElement.getKey() + "", 3);
            }
        }
        System.out.println(booksMap);

    }
    public static List<String> readFromFile(String localBookList){
        List<String> lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(Paths.get(localBookList));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return lines;
    }
    public static void writeToFile(String localContentFile){
        try {
            /*
             new File("savedFiles").mkdirs();  //mappa létrehozása, amennyiben még nem létezik
             */
            Files.write(Paths.get("savedFiles/booksCount.txt"), localContentFile.getBytes("UTF-8"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

