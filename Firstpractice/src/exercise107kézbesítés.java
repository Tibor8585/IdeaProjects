import java.util.Random;

public class exercise107kézbesítés {
    public static void main(String[] args) {
        Random random = new Random();
        int randomnumber = random.nextInt(1, 5);
        enum OrderStatus {
            ACCEPTED,
            PAYED,
            TRANSIT,
            DELIVERED
        }
        switch (randomnumber) {
            case 1:
                System.out.println("Your order is currently: " + OrderStatus.ACCEPTED);
                break;
            case 2:
                System.out.println("Your order is currently: " + OrderStatus.PAYED);
                break;
            case 3:
                System.out.println("Your order is currently: " + OrderStatus.TRANSIT);
                break;
            case 4:
                System.out.println("Your order is currently: " + OrderStatus.DELIVERED);
                break;
        }
    }
}
