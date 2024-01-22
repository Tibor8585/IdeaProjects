import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileWriting {

    public static void main(String[] args) {
        try {
            String content = "Hello." + System.lineSeparator() + "This is great. " + System.lineSeparator() + "I could create a file from java.";
            Files.write(Paths.get("my-new-file.txt"), content.getBytes("UTF-8"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

