import java.util.*;
public class preactiseSet {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        List<Integer> numbersList = new ArrayList<>();
        Random random = new Random();
        for(int i = 0; i < 20; i++) {
            int number = random.nextInt(15);
            numbers.add(number);
            numbersList.add(number);
        }
        System.out.println("Set: " + numbers);
        System.out.println(numbersList);
    }
}
