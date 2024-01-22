import java.util.Random;

public class randomDemo {
    public static void main(String[] args) {
        Random r = new Random();
            int c = 0;
            while (c < 10){
                System.out.println(r.nextInt(4, 10));
                c++;
            }
        }
    }

