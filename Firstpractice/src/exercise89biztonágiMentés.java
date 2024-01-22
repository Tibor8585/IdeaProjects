import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class exercise89biztonágiMentés {
    public static void main(String[] args) {
        writeToFile(args);
    }
    public static void writeToFile(String[] args){
        try {
            String content = args[0] + System.lineSeparator();
            Files.write(Paths.get("savedFiles/used_arguments2.txt"), content.getBytes("UTF-8"), StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
