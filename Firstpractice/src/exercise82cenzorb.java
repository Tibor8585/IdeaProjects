import java.util.Arrays;
import java.util.List;

public class exercise82cenzorb {
    public static void main(String[] args) {
        List<String> dirtyWords = Arrays.asList("kaki", "pisi");
        String originalText = args[0];

        for(String dirty : dirtyWords){
            String newText = "";
            String cenzorText = "";
            int cycle;
            for(cycle=0; cycle<=dirty.length(); cycle++){
                cenzorText+="x";
            }
            if (originalText.contains(dirty)){
                newText = originalText.replace(dirty, cenzorText);
            }
            System.out.println(newText);
        }

    }
}
