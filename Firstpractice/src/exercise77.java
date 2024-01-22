import java.util.Scanner;

public class exercise77 {
    public static void main(String[] args) {
       /* String longtext= getInputFromUser();
       String searchText = getInputFromUser();
        boolean result = isStringPresent(longtext, searchtext);
        System.out.println(result); */
        System.out.println(isStringPresent(getInputFromUser(), getInputFromUser()));

    }
    public static boolean isStringPresent(String text, String search){
      if (text.contains(search)){
            return true;
        }else {
            return false;
        }
       // return text.contains(search);
    }
    public static String getInputFromUser(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ad a string: ");
        String input = scan.nextLine();
        return input;
    }
}
