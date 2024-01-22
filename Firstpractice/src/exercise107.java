import java.util.Random;

public class exercise107 {
    public static void main(String[] args) {
        Random random = new Random();
        int order = random.nextInt(1, 5);
        if (order==1){
            System.out.println("Your order is " + OrderStatus.ACCEPTED);
        }else if(order==2){
            System.out.println("Your order is " + OrderStatus.PAYED);
        } else if(order==3){
            System.out.println("Your order is " + OrderStatus.TRANSIT);
        }else if(order==4){
            System.out.println("Your order is " + OrderStatus.DELIVERED);
        }

        }
    enum OrderStatus{
        ACCEPTED,  PAYED, TRANSIT, DELIVERED
    }
}


