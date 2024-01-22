import java.util.Scanner;

public class exercise24 {
    public static void main(String[] args) {
        System.out.println("Válassz az alábbi márkák közül: 1.Nike 2.Apple 3.Volkswagen 4.Paula 5.Red Bull 6. exit");
        Scanner scan = new Scanner(System.in);
        int answer = scan.nextInt();
        while (answer != 6){
        switch (answer) {
            case 1:
                System.out.println("Just Do It");
                break;
            case 2:
                System.out.println("Think different");
                break;
            case 3:
                System.out.println("Das auto");
                break;
            case 4:
                System.out.println("Paula egy boci, amit tud az tuti");
                break;
            case 5:
                System.out.println("A Red Bull szárnyakat ad");
                break;
            default:
                System.out.println("Az alábbiak közül válassz.");
        }
        System.out.println("Válassz az alábbi márkák közül: 1.Nike 2.Apple 3.Volkswagen 4.Paula 5.Red Bull 6. exit");
        scan = new Scanner(System.in);
        answer = scan.nextInt();

        }
    }
}
