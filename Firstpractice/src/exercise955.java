import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class exercise955 {
    public static void main(String[] args) {
        List<String> data = readFromData();
        String decide = decideValidTriange(data);
        writeResultToFile(decide);
    }

    public static List<String> readFromData() {
        List<String> dataFromFile = new ArrayList<>();
        try {
            dataFromFile = Files.readAllLines(Paths.get("src/resources/triangleExamples.txt"));
        } catch (IOException e) {
            System.out.println("NEM LÉTEZIK");
        }

        return dataFromFile;
    }

    public static String decideValidTriange(List<String> triangleData) {
        String decisionText = "";
        for (String data : triangleData) {
            String[] dataArray = data.split(",");
           int aside = Integer.parseInt(dataArray[0]);
           int bside = Integer.parseInt(dataArray[1]);
           int cside = Integer.parseInt(dataArray[2]);

            if ((aside + bside > cside) && (aside + cside > bside) && (cside + bside > aside)) {
                decisionText += "The following triange is VALID. Side A: " + aside + ", Side B: " + bside + ", Side C: " + cside + System.lineSeparator();
            } else {
                decisionText += "The following triange is INVALID. Side A: " + aside + ", Side B: " + bside + ", Side C: " + cside + System.lineSeparator();
            }
        }
        return decisionText;
        }

        public static void writeResultToFile(String localDecide){
            try {
                Files.write(Paths.get("my-new-triangle2.txt"), localDecide.getBytes("UTF-8"));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }


