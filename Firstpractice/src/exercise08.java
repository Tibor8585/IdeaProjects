import java.util.Scanner;

public class exercise08 {
    public static void main(String[] args) {
        System.out.println("Give me the side a:");
        Scanner scan = new Scanner(System.in);
        String userData1 = scan.next();

        System.out.println("Give me the side b:");
        scan = new Scanner(System.in);
        String userData2 = scan.next();

        System.out.println("Give me the side c:");
        scan = new Scanner(System.in);
        String userData3 = scan.next();

        int numbera = Integer.parseInt(userData1);
        int numberb = Integer.parseInt(userData2);
        int numberc = Integer.parseInt(userData3);

        if (numbera+numberb > numberc && numbera + numberc> numberb && numberb+ numberc > numbera){
            System.out.println("Ez egy háromszög.");
        }else {
            System.out.println("Próbáld újra.");
        }
    }
}
