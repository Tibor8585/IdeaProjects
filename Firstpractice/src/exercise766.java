import java.util.Scanner;

public class exercise766 {
    public static void main(String[] args) {
        System.out.println(getTrimmedTextFromConsole());
    }
    public static String getTrimmedTextFromConsole(){
        System.out.println("Give me a string: ");
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine().trim();
        String result ="";
        if(text.isEmpty()){
            result = "You added nothing.";
        }else {
            result = "Your answer is + " + text;
        }
        return result;
    }
}
