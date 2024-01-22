import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class exercise88 {
    public static void main(String[] args) {
        List<String> lines=new ArrayList<>();
        try {
            lines= Files.readAllLines(Paths.get("src/famos people.txt"));
            for(String line: lines){
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Nem létezik");
        }
        if(lines.contains(args[0])){
            System.out.println("It's in the file");
        }else {
            System.out.println("No luck.");
        }
        System.out.println(args[1]);
    }

}
