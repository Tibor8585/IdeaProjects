import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {

        // egy soros megjegyzés: két darab perjel után írt kifejezés kommentnek minősül
    /*
    ez egy többsoros komment lehet
    */

        int day; // változó létrehozs értékadás nélkül
        byte needEggs = 8;
        short actualMoney = 10000;
        int year = 2023; // változó létrehozs értékadással
        long totallotteryAmount = 76527652;

        System.out.println("Hello Progmatic ");
        System.out.print("Hello");
        System.out.println(year); // Itt a year tartalma 2023
        year = 2024;  // Változó értékének felülírása
        System.out.println(year); // Itt a year tartalma 2024
        System.out.println("year változó tartalma: " + year);

        String name; // String típusú változó értékadás nélkül
        String actualDay = "Saturday"; // String típusú változó értékadással
        System.out.println(actualDay);
        System.out.println("Az actualDay változó tartalma: " + actualDay);

        name= "Zsolt"; // változó értékadása
        System.out.println(name);

        /*
        Példa char típusú változó használatára
         */
        char classID; // char típusú változó értékadás nélkül
        char answer = 'c'; // char típusú változó értékadással
        System.out.println(answer);

        // Boolean
        boolean nitroFlag; // boolean típusú változó értékadás nélkül
        nitroFlag = true; // boolean típusú változó értékadással
        System.out.println(nitroFlag);
        boolean allwhelldrive = false;  // boolean típusú változó értékadással
        System.out.println(allwhelldrive);

        /*
        Nem egész számok tárolása
        */
        float average = 4.4445f;
        double averagePrecise = 4.44454444444;
    }
}
