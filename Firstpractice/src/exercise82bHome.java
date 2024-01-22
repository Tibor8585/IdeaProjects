import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class exercise82bHome {
    public static void main(String[] args) {
        List<String> dirtyWordsList = Arrays.asList("kaki", "pisi");
        censor(dirtyWordsList);
    }

    public static void censor(List<String> dirtyWords) {
        Scanner scan = new Scanner(System.in);
        String originalWords = scan.nextLine();

        for (String dirty : dirtyWords) {
            int dirtyLength=dirty.length();
            String censorX="";
            for (int cycle=0; cycle<dirtyLength ; cycle++){
                censorX+="x";
            }
            String censoredText = originalWords.replace(dirty, censorX);
            System.out.println(censoredText);
        }
    }
}