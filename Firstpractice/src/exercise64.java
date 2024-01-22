import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercise64 {
    public static void main(String[] args) {
        float numberA = getNumberFromUser();
        System.out.println(numberA);

        float numberB = getNumberFromUser2();
        System.out.println(numberB);

        String op = getOperatorFromUser();
        float res = getCalculationResult(op, numberA, numberB);
        showResultToTheUser(res);


    }

    public static float getNumberFromUser() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Number1:");
        float number1 = scan.nextFloat();

        return number1;
    }

    public static float getNumberFromUser2() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Number2:");
        float number2 = scan.nextFloat();

        return number2;
    }

    public static String getOperatorFromUser() {
        System.out.println("Give me the operator. 1=+, 2=-, 3=*, 4=/:");
        Scanner scan2 = new Scanner(System.in);

        String userOperator = scan2.next();

        return userOperator;

    }

    public static float getCalculationResult(String operator, float number1, float number2) {
        float callResult=0;
        switch (operator) {
            case "+":
                callResult = number1 + number2;
                break;
            case "-":
                callResult = number1 - number2;
                break;
            case "*":
                callResult = number1 * number2;
                break;
            case "/":
                callResult = number1 / number2;
                break;
            case "pumped":
                callResult = number1 * number1 * number1 * number2 * number2 * number2;
                break;

        }
        return callResult;
    }
    public static void showResultToTheUser(float result) {
        System.out.println("The result is: " + result);
    }
}

