import java.util.Random;

public class exercise19 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(1, 22);
        int randomNumber2 = random.nextInt(1, 22);

        int index = 1;
        while (index <= 21) {
            if (index == randomNumber) {
                System.out.println(index + " te felelsz.");
            }

            if (index == randomNumber2) {
                System.out.println(index + " te felelsz.");
            }
            index++;
        }
    }
}