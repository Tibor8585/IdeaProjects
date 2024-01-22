import java.util.Scanner;

public class exercise12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        String currentColor = "";
        while (true) {
            System.out.println("Milyen színű az üveg?");
            currentColor = sc.nextLine();
            if (currentColor.equals("z")){
                sum = sum + 10;
            }else if (currentColor.equals("f")){
                sum = sum + 30;
            }else if (currentColor.equals("x")){
                break;
            }else {
                System.out.println("Ismeretlen szín.");
            }
        }
        System.out.println("Összeg: " + sum);
    }
}
