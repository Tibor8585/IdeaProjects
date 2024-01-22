import java.util.Scanner;

public class exercise106vizsgaÉrték {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Adja meg az elért eredményt: ");
        int result = scan.nextInt();
        int minScore = Integer.parseInt(args[0]);
        enum examStatus {
            PASSED,
            FAILED
        }
        if(result>=minScore){
            System.out.println("A vizsgád eredménye: " + examStatus.PASSED);
        }else {
            System.out.println("A vizsgád eredménye: " + examStatus.FAILED);
        }

    }
}
