import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class exercise82home {
    public static void main(String[] args) {
        List<String> dirtyWordsList = Arrays.asList("kaki", "pisi");
        censor(dirtyWordsList);
    }


    public static void censor(List<String> dirtyWords){
        Scanner scan=new Scanner(System.in);
        String originalWords= scan.nextLine();

        for(String dirty : dirtyWords){
           String censoredText = originalWords.replace(dirty, "x");
            System.out.println(censoredText);
        }

    }
}
