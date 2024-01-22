import java.util.Scanner;

public class exercise79 {
    public static void main(String[] args) {
        String answer = getInputWithCustomText("Válassz a/b/c: ");
        System.out.println(getFirstCharacterOfString("Normalized answer: " + answer));
    }
    public static String getInputWithCustomText(String question){
        Scanner scanner = new Scanner(System.in);
        System.out.println(question);
        return scanner.nextLine();
    }
    public static char getFirstCharacterOfString(String text){
        return text.charAt(0);
    }
}
