import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class exercise88IOHome {
    public static void main(String[] args) {
        try {
            List<String> lines = Files.readAllLines(Paths.get("src/resources/sportPlayers"));

               if(lines.contains(args[0])){
                   System.out.println("It’s in the file”");
               }else {
                   System.out.println("Nem létezik.");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
