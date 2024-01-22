import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class exerciseee95 {
    // Készítsetek egy olyan alkalmazást, amely egy fájlból felolvas különböző háromszögek lehetséges értékeit.
    // Minden egyes sor egy lehetséges háromszög oldalait tartalmazza. (triangleExamples.txt).
    // A program végig iterál a listán ami a fájlban van és minden egyes sorról eldönti hogy a háromszög szerkeszthető-e
    // és ki is írja a képernyőre. Minimum minden olyan esetet vegyetek fel mint példa háromszög, ami szerintetek szükség van,
    // hogy megfelelően le legyen tesztelve a logika. Az eredmény kerüljön lementésre egy fájlba (triangleResults.log).
    public static void main(String[] args) {
        // 1. triangleExamples.txt-bem teszt esetek létrehozása (Pl.: side a: 5, side b: 6, side c: 7. Pl 2.: 5,6,7)
        // 2. metódus létrehozása az adatok beolvasásásra
        List<String> data = readDataFromFile();  //["5,6,7", "6,7,5", "7,6,5", ...];
        // 3. metódus létrehozása a háromszögek szerkeszthetőségének eldöntésére
        String resultToFile = decideValidTriange(data); //(Pl.: "The following triange is VALID. Side A: 5, Side B: 6, Side C: 7/n The following triange is INVALID. Side A: 5, Side B: 6, Side C: 7")
        // 4. az eredmény triangleResults.log-ba mentése
        writeResultToFile(resultToFile);
    }

    public static List<String> readDataFromFile() {
        List<String> dataFromFile = new ArrayList<>(); //["5,6,7", "6,7,5", "7,6,5", ...];
        // kód
        //a megadott fájl beolvasása
        try {
            dataFromFile = Files.readAllLines(Paths.get("src/resources/triangleExamples.txt"));
        } catch (IOException e) {
            System.out.println("NEM LÉTEZIK");
        }

        return dataFromFile;
    }

    public static String decideValidTriange(List<String> triangleList) {
        System.out.println(triangleList);  //["5,6,7", "6,7,5", "7,6,5", ...];
        // kód
        String decisionText = "";
        for (String triangle : triangleList) {
            System.out.println(triangle);
            //triangle = "5,6,7"   --->  5 6 7 int típusú értékként
            String[] dataArray = triangle.split(","); // --->["5","6","7"]
            int aside = Integer.parseInt(dataArray[0]);  // 5
            int bside = Integer.parseInt(dataArray[1]);  // 6
            int cside = Integer.parseInt(dataArray[2]);  // 7

            if ((aside + bside > cside) && (aside + cside > bside) && (cside + bside > aside)) {
                decisionText += "The following triange is VALID. Side A: " + aside + ", Side B: " + bside + ", Side C: " + cside + System.lineSeparator();
            } else {
                decisionText += "The following triange is INVALID. Side A: " + aside + ", Side B: " + bside + ", Side C: " + cside + System.lineSeparator();
            }
        }
        return decisionText; //(Pl.: "The following triange is VALID. Side A: 5, Side B: 6, Side C: 7/n The following triange is INVALID. Side A: 5, Side B: 6, Side C: 7")
    }

    public static void writeResultToFile(String result) {
        try {
            Files.write(Paths.get("my-new-file.txt"), result.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
