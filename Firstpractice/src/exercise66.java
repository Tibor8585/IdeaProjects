import java.util.Scanner;

public class exercise66 {
    public static void main(String[] args) {
        String[] array = getbrandfromuser();
        isFavoriteBrandInArray(array);
    }

    public static String[] getbrandfromuser() {
        String[] carsArray = new String[3];
        Scanner scan = new Scanner(System.in);
        String currentInput = "";
        int carsArrayIndex = 0;
        while (!((currentInput = scan.next()).equals("x")) && carsArrayIndex < carsArray.length-1) {
            carsArray[carsArrayIndex] = currentInput;
            carsArrayIndex++;
        }
        return carsArray;
    }

    public static void isFavoriteBrandInArray(String[] array) {
        String myFavoriteCar = "Ferrari";
        for (int i = 0; i < array.length-1; i++) {
            if (array[i].equals(myFavoriteCar)) {
                System.out.println(array[i] + " a kedvenc autómárkám.");
                //break az opcionális, optimalizálás miatt berakható, hogy ne nézze a tömb többi elemét, ha már megtalálta az egyezőt
                break;
            }
        }
    }
}
