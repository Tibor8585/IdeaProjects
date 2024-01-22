import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class exercise95haromszög {
    public static void main(String[] args) {
        List<String> triangleList = fileReading();
        String decide = decideValidTriangle(triangleList);
        writeToFile(decide);
    }

    public static List<String> fileReading() {
        List<String> trianglesides = new ArrayList<>();
        try {
            trianglesides = Files.readAllLines(Paths.get("src/resources/triangleExamples.txt"));

        } catch (IOException e) {
            System.out.println("NEM LÉTEZIK");
        }
        return trianglesides;
    }

    public static String decideValidTriangle(List<String> triangleList) {
        String decisionText ="";
        for (String triangleData : triangleList) {
            String[] triangleArray = triangleData.split(",");
            String sideA = triangleArray[0];
            String sideB = triangleArray[1];
            String sideC = triangleArray[2];
            int aside = Integer.parseInt(sideA);
            int bside = Integer.parseInt(sideB);
            int cside = Integer.parseInt(sideC);

            if ((aside + bside > cside) && (aside + cside > bside) && (cside + bside > aside)) {
                decisionText += "The following triange is VALID. Side A: " + aside + ", Side B: " + bside + ", Side C: " + cside + System.lineSeparator();
            } else {
                decisionText += "The following triange is INVALID. Side A: " + aside + ", Side B: " + bside + ", Side C: " + cside + System.lineSeparator();
            }
        }
        return decisionText;
    }

    public static void writeToFile(String content){
        try {
            Files.write(Paths.get("savedFiles/triangleResult2"), content.getBytes("UTF-8"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
