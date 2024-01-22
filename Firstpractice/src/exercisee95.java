import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class exercisee95 {
    public static void main(String[] args) {
        List<String> data = readDataFromFile(); //"2, 3, 4", "4, 5, 6",.....

        String resultToFile = decideValidTriange(data);

        writeResultToFile(resultToFile);
    }
    public static List<String> readDataFromFile(){
        List<String> dataFromFile = new ArrayList<>();

        try {
            dataFromFile = Files.readAllLines(Paths.get("src/resources/triangleExamples.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
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

    public static void writeResultToFile(String result){
        try {
            Files.write(Paths.get("my-new-triangle.txt"), result.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

