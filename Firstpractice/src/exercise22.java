import java.util.Scanner;

public class exercise22 {
    public static void main(String[] args) {
        System.out.println("Kívánja használni a számológépet? Y/N (Yes/No)");
        Scanner scan = new Scanner(System.in);
        String answer = scan.next();
       while(answer.equals("Y")){
        System.out.println("Give me the number first:");
        scan = new Scanner(System.in);
        String userDataA = scan.next();
        System.out.println("Give me the number second:");
        scan = new Scanner(System.in);
        String userDataB = scan.next();
        System.out.println("Give me the operator. 1=+, 2=-, 3=*, 4=/:");
        scan = new Scanner(System.in);
        String userOperator = scan.next();

        int firstNumber = Integer.parseInt(userDataA);
        int secondNumber = Integer.parseInt(userDataB);
        int operator = Integer.parseInt(userOperator);


        switch (operator) {
            case 1:
                System.out.println(firstNumber + secondNumber);
                break;
            case 2:
                System.out.println(firstNumber - secondNumber);
                break;
            case 3:
                System.out.println(firstNumber * secondNumber);
                break;
            case 4:
                System.out.println(firstNumber / secondNumber);
                break;
        }
            System.out.println("Kívánja újra használni a számológépet?");
            scan = new Scanner(System.in);
            answer = scan.next();
        }
        System.out.println("További szép napot!");
    }
}
