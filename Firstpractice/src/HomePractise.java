public class HomePractise {
    public static void main(String[] args) {
        int a = 2000;
        int b = 31;
        int c = a + b;
        System.out.println(c);
        int d = a - b;
        System.out.println(d);
        int e = a * b;
        System.out.println(e);
        double f = 9.32;
        double g = 1.93;
        double h = f / g;
        System.out.println(h);
        boolean aIsEqual1B = a == b;
        System.out.println(aIsEqual1B);
        boolean aIsNotEqual1B = a != b;
        System.out.println(aIsNotEqual1B);
        boolean resultOfAnAndOperator = (a > 200) && (b < -200);
        System.out.println(resultOfAnAndOperator);
        boolean resultOfAnOrOperator = (a > 2000000) || (b > -200);
        System.out.println(resultOfAnOrOperator);
        System.out.println(7 % 2);
        int a2 = 5;
        a2++;
        System.out.println("a2 after ++ is " + a2);
        int a3 = 7;
        a3--;
        System.out.println("a3 after -- is " + a3);
        int a4 = 10;
        a4 += 7;
        System.out.println("a4 after += is " + a4);
        int a5 = 1;
        a5-=7;
        System.out.println("a5 after -= is " + a5);
        int a6 = 3;
        a6 *=6;
        System.out.println("a6 after *= is " + a6);
        String hello = "Hello";
        String world = "World!";
        System.out.println(hello + world);
        System.out.println("--------------------------------------------------");
        int number3 = 7;
        System.out.println(number3);
        number3++;
        System.out.println(number3); //8
        number3--;
        System.out.println(number3); //7
        System.out.println(number3++); // eredmény 7, mert kiírja a nuber3 értékét és utána növeli meg eggyel
        System.out.println(number3--); // Eredmény 8
        System.out.println(number3); // eredmény 7
    }
}
