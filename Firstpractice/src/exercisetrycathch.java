public class exercisetrycathch {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        double res = 0;
        System.out.println("try előtt");
        try {
            System.out.println("Kifejezés előtt.");
            res = a / b;
            System.out.println("Kifejezés után");
            if(b<0) {
                throw new IllegalStateException();
            }
        } catch (ArithmeticException e) {
            System.out.println("catchben");
        } catch (IllegalStateException e) {
            System.out.println("catchben2");

            System.out.println("Catch után");
        }finally {
            System.out.println("Mindig lefut");
        }
    }
}