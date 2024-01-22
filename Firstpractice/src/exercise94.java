import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;
public class exercise94 {
    // Dolgozzátok át a számológép programot úgy, hogy tartalmazzon külön metódust az adatokbekérésre a felhasználótól
    // ( getNumberFromUser() ), valamint egyet az operátor beolvasásra (getOperatorFromUser() ).
    // Ezt követően egy külön metódust amely elvégzi a műveletet és visszaadja az eredményt
    // ( getCalculationResult(operator, number1, number2) ), Végül egy metódust ami kiírja az eredményt a konzolra
    // (showResultToTheUser(result) )
    public static void main(String[] args) {
        float numberA = getNumberFromUser();
        float numberB = getNumberFromUser();
        String op = getOperatorFromUser();
        float res = getCalculationResult(op, numberA, numberB);
        showResultToTheUser(res);
        writeToFile(numberA, numberB, op, res);
    }

    public static float getNumberFromUser() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Number:");
        float number = scan.nextFloat();
        return number;
    }

    public static String getOperatorFromUser() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Operator:");
        String operator = scan.next();
        return operator;
    }
    public static float getCalculationResult(String operator, float number1, float number2) {
        float calResult = 0;
        switch (operator) {
            case "+":
                calResult = number1 + number2;
                break;
            case "-":
                calResult = number1 - number2;
                break;
            case "":
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

    public static void showResultToTheUser(float result) {
        System.out.println("The result is: " + result);
    }
    public static void writeToFile(double a, double b, String op, double result) {
        try {
            Files.writeString(Paths.get("src/resources/calculator.log"),
                    a + " " + op + " " + b + " = "  + result + System.lineSeparator(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
