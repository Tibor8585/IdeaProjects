public class PactiseOperators {
    public static void main(String[] args) {
        int number1 = 5;
        int number2 = 7;
        boolean result;
        result =  number1 == number2; // esetében ha a két értéket összehasonlítjuk az erednény true vagy false
        System.out.println(result);
        System.out.println(number1!=number2);

        /* Logikai ÉS operátor az eredménye igaz/hamis lesz
        Akkor lesz csak az eredménye true, ha mindkét oldala true.
         */
        System.out.println(4 == 4 && 5 == 7); // true && false ezért a végeredmény false
        System.out.println(11 != 0 && 5 != 7); // true && true ezért a végeredmény true

        /*
        Logikai VAGY operátor az eredménye igaz/hamis lesz. CSak akkor false, ha mindkét tagja false
         */
        System.out.println(4 == 4 || 5 == 7); // true && false ezért a végeredmény true
        System.out.println(11 != 0 || 5 != 7); // true && true ezért a végeredmény true


        /* Arithmetical operators (+,-,*,/)
         */
        System.out.println("Number1 variable: " + number1);
        System.out.println(number1 + 11);
        System.out.println(number1-2);
        System.out.println(number1 * 3);
        System.out.println(number1 / 2); // Mivel az int egész számokat tárol, levágja a tizedes részt
        System.out.println(5 % 2); // az osztást követő maradékot adja vissza az eredmény
        System.out.println(4.7f / 2.1f);
        long num1 = 127 * 10000000000000l;
        System.out.println("Jancsi" + "Juliska");
        System.out.println("5" + 1); // 51-lesz
        System.out.println("eredmény:" + 5 + 1); // eredmeny: 51 lesz
        System.out.println("eredmény:" + (5 + 1)); // eredmeny: 6 lesz
        System.out.println("eredmény:" + 5 * 2); // eredmeny: 10 lesz

        /*
        Inkrement/decrement operators
         */
        int number3 = 7;
        System.out.println(number3);
        number3++;
        System.out.println(number3); //8
        number3--;
        System.out.println(number3); //7
        System.out.println(number3++); // eredmény 7, mert kiírja a nuber3 értékét és utána növeli meg eggyel
        System.out.println(number3--); // Eredmény 8
        System.out.println(number3); // eredmény 7

        /*
        +=, -=, *=, /=
         */
        int number4= 10;
        number4 +=3; //number4 + 3
        System.out.println(number4); //13
        number4-=5;
        System.out.println(number4); //8
    }
}