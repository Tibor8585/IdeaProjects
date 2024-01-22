import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class exercise82b {
    public static void main(String[] args) {
        String words=words();
        replaceWords(words);


    }
    public static void replaceWords(String localWords) {
        List<String> blackList = Arrays.asList("kaki", "pisi");
        for(String black: blackList){
            int blackLength=black.length();
            String maskText="";
            for (int cycleVar=0; cycleVar<blackLength; cycleVar++){
                maskText +=  "*";
            }
            localWords=localWords.replace(black,maskText);
            System.out.println(localWords=localWords.replace(black,maskText));
        }
    }

    public static String words(){
        Scanner scan= new Scanner(System.in);
        String string= scan.nextLine();
        return string;
    }
}
