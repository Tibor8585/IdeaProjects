import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class exercise51 {
    public static void main(String[] args) {
        Set<String> weekendList= new HashSet<>();
        Scanner scan = new Scanner(System.in);
        String program="";
        while(!(program.toLowerCase().equals("x"))){
            System.out.println("Mi a tennedő?");
            program=scan.nextLine();
            if(program.toLowerCase().equals("x")){
                break;
            }if (!(program.toLowerCase().equals("x"))){
                weekendList.add(program);
            }
        }
        System.out.println("A programok: " + weekendList);
    }
}
