import java.util.Scanner;

public class exercise18 {
    public static void main(String[] args) {
        System.out.println("Give me the number first:");
        Scanner scan = new Scanner(System.in);
        String userDataA = scan.next();
        System.out.println("Give me the number first:");
        scan = new Scanner(System.in);
        String userDataB = scan.next();
        System.out.println("Give me the operator. 1=+, 2=-, 3=*, 4=/:");
        scan = new Scanner(System.in);
        String userOperator = scan.next();

        int firstNumber = Integer.parseInt(userDataA);
        int secondNumber = Integer.parseInt(userDataB);
        int operator = Integer.parseInt(userOperator);


        switch (operator){
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

    }
}
