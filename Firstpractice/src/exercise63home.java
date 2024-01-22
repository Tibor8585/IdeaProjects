import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercise63home {
    public static void main(String[] args) {
       List<Integer> data = getTriangleDataFromConsole();
        System.out.println(data);
        boolean valid = isTriangleValid(data);
        System.out.println(valid);
    }

    public static List<Integer> getTriangleDataFromConsole() {

        List<Integer> TriangleData = new ArrayList<>();

        System.out.println("Give me the side a:");
        Scanner scan = new Scanner(System.in);
        String userData1 = scan.next();

        System.out.println("Give me the side b:");
        scan = new Scanner(System.in);
        String userData2 = scan.next();

        System.out.println("Give me the side c:");
        scan = new Scanner(System.in);
        String userData3 = scan.next();

        TriangleData.add(Integer.parseInt(userData1));
        TriangleData.add(Integer.parseInt(userData2));
        TriangleData.add(Integer.parseInt(userData3));
        return TriangleData;
    }

    public static boolean isTriangleValid(List<Integer> data) {
        if (data.get(0) + data.get(1) > data.get(2) &&
                data.get(1) + data.get(2) > data.get(0) &&
                data.get(0) + data.get(2) > data.get(1)) {
            return true;
        }else {
            return false;
        }
    }
}
