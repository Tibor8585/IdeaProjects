import java.util.Scanner;

public class exercise79home {
    public static void main(String[] args) {
        String answer = getInputWithCustomText("Give me your choice a/b/c: ");
        String firstCharackter=getFirstCharacterOfStringasString(answer);
        System.out.println(firstCharackter);
    }

    public static String getInputWithCustomText(String question) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(question);
        return scanner.nextLine();
    }
    public  static char  getFirstCharacterOfString(String localAnswer){
        return localAnswer.charAt(0);

    }
    public static String getFirstCharacterOfStringasString(String localAnswer){
        return localAnswer.substring(0,1);
    }
}
