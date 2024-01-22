public class prctiseExceptions {
    public static void main(String[] args) {

        int a = -10;
        int b = 0;
        double res = 0;
        System.out.println("try előtt");
        try {
            int[] exampleArray = {21, 44, 33, 77};
            System.out.println(exampleArray[15]);

            System.out.println("kifejezés előtt");
            res = a / b;
            System.out.println("kifejezés után");
            if (a < 0) {
                throw new IllegalStateException();
            }

        } catch (ArithmeticException e) {
            System.out.println("catchben");
        } catch (IllegalStateException e) {
            System.out.println("catchben2");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("tömb hiba");
        }
        finally {
            System.out.println("mindig lefut");

        }
        System.out.println("catch után");

    }

}
