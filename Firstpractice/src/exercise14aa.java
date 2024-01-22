import java.util.Random;

public class exercise14aa {
    public static void main(String[] args) {
        Random random = new Random();
        int number1 = random.nextInt(1, 91);
        int number2 = random.nextInt(90) + 1;
        while (number2 == number1) {
            number2 = random.nextInt(90) + 1;
        }
        int number3 = random.nextInt(90) + 1;
        while (number3 == number1 || number3 == number2) {
            number3 = random.nextInt(90) + 1;
        }
        int number4 = random.nextInt(90) + 1;
        while (number4 == number1 || number4 == number2 || number4 == number2) {
            number4 = random.nextInt(90) + 1;
        }
        int number5 = random.nextInt(90) + 1;
        while (number5 == number1 || number5 == number2 || number5 == number3 || number5 == number4) {
            number5 = random.nextInt(90) + 1;
        }
        System.out.println("az öt szám: " + number1 + "," + number2 + "," + number3 + "," + number4 + "," + number5);

        int number1a = random.nextInt(1, 46);
        int number2a = random.nextInt(1, 46);
        while (number2a == number1a) {
            number2a = random.nextInt(1, 46);
        }
        int number3a = random.nextInt(1, 46);
        while (number3a == number1a || number3a == number2a) {
            number3 = random.nextInt(1, 46);
        }
        int number4a = random.nextInt(1, 46);
        while (number4a == number1a || number4a == number2a || number4a == number2a) {
            number4 = random.nextInt(1, 46);
        }
        int number5a = random.nextInt(1, 46);
        while (number5a == number1a || number5a == number2a || number5a == number3a || number5a == number4a) {
            number5a = random.nextInt(1, 46);
        }
        int number6a = random.nextInt(1, 46);
        while (number6a == number1a || number6a == number2a || number6a == number3a || number6a == number4a || number6a == number5a) {
            number6a = random.nextInt(1, 46);
        }
        System.out.println("A hatoslottó nyerőszámai: " + number1a + "," + number2a + "," + number3a + "," + number4a + "," + number5a + "," + number6a);
    }
}

