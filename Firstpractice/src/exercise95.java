import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class exercise95 {
    public static void main(String[] args) {
        List<String>numbersList = readFromFile("src/resources/triangleExamples.txt");
    }
    public static List<String> readFromFile(String localTriangleExamples){
        List<String>numbers = new ArrayList<>();
        try {
            numbers = Files.readAllLines(Paths.get(localTriangleExamples));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return numbers;
    }
    public static Integer numbersToInteger(List<String>numbersList){

        for(String trianglenumbers: numbersList) {
            String[] foodArray = trianglenumbers.split(", ");
            String aSlide = foodArray[0];
            String bSlide = foodArray[1];
            String cSlide = foodArray[2];
            int[] aSlideArray = new int[]{Integer.parseInt(aSlide)};
            int[] bSlideArray = new int[]{Integer.parseInt(bSlide)};
            int[] cSlideArray = new int[]{Integer.parseInt(cSlide)};
        }

return 1;
    }
}
