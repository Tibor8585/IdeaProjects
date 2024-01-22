import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercise44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> weekendList= new ArrayList<>();
        String program="";
        while(!(program.toLowerCase().equals("x"))){
            System.out.println("Mi a tennedő?");
            program=sc.nextLine();
            if(program.toLowerCase().equals("x")){
               break;
            }if (!(program.toLowerCase().equals("x"))){
                weekendList.add(program);
            }
        }
        System.out.println("A programok: " + weekendList);
    }
}
