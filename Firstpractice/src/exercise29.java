import java.util.Random;

public class exercise29 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomParent = random.nextInt(2);
        if (randomParent == 0) {
            int program = random.nextInt(0, 3);
            System.out.println("Apás program.");
            switch (program) {
                case 1:
                    System.out.println("Menjetek a focizni");
                    break;
                case 2:
                    System.out.println("Menjetek moziba");
                    break;
            }
        } else {
            int program = random.nextInt(0, 3);
            System.out.println("Anyás program.");
            switch (program) {
                case 1:
                    System.out.println("Menjetek a játszótérre.");
                    break;
                case 2:
                    System.out.println("Menjetek könyvesboltba.");
                    break;
            }
        }
    }
}