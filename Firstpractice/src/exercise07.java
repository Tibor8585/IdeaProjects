import java.util.Scanner;

public class exercise07 {
    public static void main(String[] args) {
        System.out.println("Adj meg egy számot 1-7 között, ami a hét napjait reprezentálja.");
        Scanner scan = new Scanner(System.in);
        String day = scan.next();
        int userday = Integer.parseInt(day);

        if (userday == 4 || userday == 5 || userday==6){
        System.out.println("Italos nap van.");
        }else {System.out.println("Ez nem a te napod");
        }
    }
}
