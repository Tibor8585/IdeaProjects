public class exercise84b {
    public static void main(String[] args) {
        try {
            printArgConsole(args);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Nincs argument");
        }

    }

    public static void printArgConsole(String[] args) throws ArrayIndexOutOfBoundsException {
        System.out.println(args[0]);
    }
}
