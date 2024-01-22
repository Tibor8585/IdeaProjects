import java.util.Scanner;

public class exercise86home {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Adj meg egy szót: ");
        String data = scan.nextLine();
        processData(data);
    }
    public static void processData(String data){
        try {
            char ten = data.charAt(10);
            System.out.println(ten);
        } catch (Exception ex) {
            System.out.println("There aren't tenth charackter");
        }
    }
}
