import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class exercise73 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> shoppingList=new HashMap<>();
        System.out.println("Add meg a vásárolni kívánt termék nevét, számát. X-esetén kilép");
        String userInput;
        do{
            System.out.println("Vásárolni kívánt termék: ");
            userInput=scanner.nextLine();
            if(!userInput.equalsIgnoreCase("X")){
                String[] userInputArray=userInput.split("-");
                String item=userInputArray[0];
                String value= userInputArray[1];
                int valueInt=Integer.parseInt(value);
                shoppingList.put(item, valueInt);
            }
        }while (!userInput.equalsIgnoreCase("X"));

        }

    }

