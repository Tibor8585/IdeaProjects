import java.util.Scanner;

public class exercise81 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Give me a text: ");
        replaceTExtAndWriteToConsole(scan.nextLine());
    }
    public static void replaceTExtAndWriteToConsole(String text){
        String result = text.replace("legrosszabb", "legjobb");
        System.out.println(result);


    }
}
