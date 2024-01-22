import java.util.Scanner;

public class exercise64home {
    public static void main(String[] args) {
       float number = getNumberFromUser();
       float number2 = getNumberFromUser2();
        String operator = getOperatorFromUser();
       float result = getCalculationResult(number, number2, operator);
        showResultToTheUse(result);
    }
    public static float getNumberFromUser(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Number:");
        float number = scan.nextFloat();
        return number;
        }
    public static float getNumberFromUser2(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Number:");
        float number = scan.nextFloat();
        return number;
    }
    public static String getOperatorFromUser(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Operator:");
        String operator = scan.next();
        return operator;
    }
    public static float getCalculationResult(float number1, float number2, String operator){
        float calResult = 0;
        switch (operator) {
            case "+":
                calResult = number1 + number2;
                break;
            case "-":
                calResult = number1 - number2;
                break;
            case "*":
                calResult = number1 * number2;
                break;
            case "/":
                calResult = number1 / number2;
                break;
            case "pumped":
                calResult = number1 * number1 * number1 * number2 * number2 * number2;
                break;
    }
            return calResult;
    }
    public static void showResultToTheUse(float result){
        System.out.println("The result is: " + result);
    }
}
