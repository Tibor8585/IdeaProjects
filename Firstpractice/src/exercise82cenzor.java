import java.awt.*;
import java.util.Arrays;
import java.util.List;

public class exercise82cenzor {
    public static void main(String[] args) {
        List<String> dirtyWords = Arrays.asList("kaki", "pisi");
        String originalText = args[0];
       for(String dirty : dirtyWords){
           String newText = "";
           if (originalText.contains(dirty)){
               newText = originalText.replace(dirty, "x");
           }
           System.out.println(newText);
       }

    }

}
