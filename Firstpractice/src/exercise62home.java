import java.util.Scanner;

public class exercise62home {
    public static void main(String[] args) {
        String age = getValidAgeFromConsole();
        System.out.println("Az életkorod: " + age);
    }
    public static String getValidAgeFromConsole(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Add meg az életkorod!");
        int answer = scan.nextInt();
        if(answer>=0 && answer<140){
           return answer + "";
        }else {
            return "Ez nem egy reális életkor.";
        }

    }
}
