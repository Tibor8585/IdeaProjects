public class exercise84bhome {
    public static void main(String[] args) {
        try {
            printArgConsole(args);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("There is no arguments");
        }
    }
    public static void printArgConsole (String[] args) throws ArrayIndexOutOfBoundsException {
        System.out.println(args[0]);
    }
}
