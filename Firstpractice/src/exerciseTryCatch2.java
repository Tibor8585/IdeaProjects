public class exerciseTryCatch2 {
    public static void arrayMethod() throws ArrayIndexOutOfBoundsException {
        int[] exampleArray = {21, 44, 33, 77};
        System.out.println(exampleArray[15]);
    }

    public static void main(String[] args) {
        try {
            arrayMethod();
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Hey, there is no such an index in the array!");
        }
        System.out.println("Thanks for using our service!");
    }
}
