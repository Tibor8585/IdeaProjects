import java.util.Scanner;

public class exercise61nagykoru {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Add meg az életkorod: ");
        int age = scan.nextInt();
        ageCheck(age);
    }
    public static void ageCheck(int localAge){
        if (localAge >= 18){
            System.out.println("Jogosult vagy a belépésre.");

        }else {
            System.out.println("Sicc innen.");
        }
    }
}
