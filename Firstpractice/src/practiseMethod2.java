import javax.print.attribute.IntegerSyntax;
import java.util.List;

public class practiseMethod2 {

    public static void main(String[] args) {
        System.out.println(atlag(2,3));


    }
    public static double atlag (int szam1, int szam2){
        return (szam1 + szam2) /2.0;
    }
    public static double atlag (List<Integer> numbers){
        int c = 0;
        for (int n: numbers){
            c+=n;}
        return c/numbers.size();

    }

}
