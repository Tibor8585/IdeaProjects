public class practiseStringOperators {
    public static void main(String[] args) {
        String name = "Steve Jobs";
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.contains("ev"));
        System.out.println(name.endsWith("Jobs"));
        System.out.println(name.startsWith("St"));
        System.out.println(name.indexOf("e"));   //az első előfordulása az adott karakter(ek)nek
        System.out.println(name.charAt(3));  //megkérdezzük mi az adott indexen lévő karakter
        System.out.println(name.replace("e","*"));  //lecseréli a karaktereket
        System.out.println(name.substring(2));  // az adott index-től kezdve kivágja a String-et
        System.out.println(name.substring(2,4));  // az adott index-től az adott indexig kezdve kivágja a String-et. az endindex nem lesz az eredmény része
        System.out.println(name.trim());  //a string elejéről és végéről eltávolításra kerülnek a szóközök
        System.out.println(name);  //az eredeti változó értéke nem változik csak felülírással

        String fruits = "Málna-Eper";
        System.out.println(fruits.split("-")[0]);         //"Málna-Eper"  --  ["Málna","Eper"]
        System.out.println(fruits.split("-")[1]);         //"Málna-Eper"  --  ["Málna","Eper"]

        String bob = "Bob";
        System.out.println(bob);
        bob.toLowerCase();
        System.out.println(bob); //az eredeti változó értéke nem változik csak felülírással

        String adam = "Adam";
        System.out.println(adam);
        adam = adam.toLowerCase();
        System.out.println(adam);
    }

}
