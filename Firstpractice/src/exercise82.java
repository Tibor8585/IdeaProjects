import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class exercise82 {
    public static void main(String[] args) {
        String words=words();
        replaceWords(words);


    }
    public static void replaceWords(String localWords) {
        List<String> blackList = Arrays.asList("kaki", "pisi");
        for(String black: blackList){
            localWords=localWords.replace(black,"x");
            System.out.println( localWords=localWords.replace(black,"x"));
        }
    }

    public static String words(){
        Scanner scan= new Scanner(System.in);
        String string= scan.nextLine();
        return string;
    }
}
