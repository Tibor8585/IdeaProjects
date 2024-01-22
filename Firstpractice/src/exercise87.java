import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercise87 {
    public static void main(String[] args) {
        List<String> nameList = readFromFile();
        boolean result = examineString(nameList);
        readToFile(result);

    }

    public static List<String> readFromFile() {
        List<String> names = new ArrayList<>();
        try {
            names = Files.readAllLines(Paths.get("src/resources/name-file.txt"));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return names;
    }

    public static boolean examineString(List<String> localNamelist) {
        Scanner scan = new Scanner(System.in);
        String consoleName = scan.nextLine();
        boolean answer = true;
            if (localNamelist.contains(consoleName)) {
                answer = true;
            } else {
                answer = false;
            }
        return answer;
    }
    public  static void readToFile (boolean localResult){
        String content = localResult + "" + System.lineSeparator();
        try {
            Files.write(Paths.get("savedFiles/result"), content.getBytes("UTF-8"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
