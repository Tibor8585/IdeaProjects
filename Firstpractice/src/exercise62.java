import java.util.Scanner;

public class exercise62 {
    public static void main(String[] args) {
        System.out.println(getValidAgeFromConsole());
    }
    public static String getValidAgeFromConsole(){
        Scanner scan = new Scanner(System.in);
        int ageFromUser = scan.nextInt();
        if (ageFromUser >=0 && ageFromUser <140){
            return ageFromUser + "";
        }else {
            return "hiba";
        }
    }
}
