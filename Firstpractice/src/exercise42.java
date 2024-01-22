import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercise42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Float> fever= new ArrayList<>();
        float sum=0;
        int i= 1;

        while(i<=9){
            System.out.println("Mennyi az " + i + " testhőmérséklet?");
            fever.add(sc.nextFloat());
            i++;
        }
        for(float feverSum: fever){
            sum += feverSum;
        }
        System.out.println("A testhőmérséklet átlaga: " + sum/9);
    }
}
