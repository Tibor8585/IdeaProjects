import java.util.Random;

public class exercise19b {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber;
        int randomNumber2;

        do{
            randomNumber = random.nextInt(1, 22);
            randomNumber2 = random.nextInt(1, 22);
        }while(randomNumber==randomNumber2);

    }
}
