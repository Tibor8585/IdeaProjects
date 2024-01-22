import java.util.Random;

public class exercise06 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(5);

        if (randomNumber == 0){
            System.out.println("Ma szerencsés napod lesz");
        }else if(randomNumber ==1){
            System.out.println("Ma találkozol egy kedves ismerőssel");
        } else if(randomNumber == 2) {
            System.out.println("Ma megtalálod életed szerelmét");
        }else if(randomNumber==3){
            System.out.println("Sok pénz áll ma a házhoz");
        }else {
            System.out.println("Ma egy új lehetőség nyílik meg előtted");
        }
    }
}
