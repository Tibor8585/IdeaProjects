import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercise44realb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> weekendList = new ArrayList<>();
        String program = "";
        while (!(program.toLowerCase().equals("x"))) {
            System.out.println("Mi a tennedő?");
            program = sc.nextLine();
            if (program.toLowerCase().equals("x")) {
                break;
            }
            if (!weekendList.contains(program)) {
                weekendList.add(program);
            }else{
                weekendList.remove(program);
                System.out.println("Ez az elem már hozzáadásra került. Így törlődni fog.");
                weekendList.remove(program);
            }

            System.out.println("A programok: " + weekendList);
        }
    }
}
