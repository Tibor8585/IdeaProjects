import java.util.HashMap;
import java.util.Map;
public class exercise84 {
    public static void main(String[] args) {

        printArgConsole(args);
    }
    public static void printArgConsole(String[] args){
        try {
            System.out.println(args[0]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Nincs argument");
        }

    }
}
