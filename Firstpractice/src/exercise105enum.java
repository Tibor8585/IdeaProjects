public class exercise105enum {
    public static void main(String[] args) {
        enum Day {
            HÉTFŐ, KEDD, SZERDA, CSÜTÖRTÖK, PÉNTEK, SZOMBAT, VAASÁRNAP
        }
        for (Day myVar : Day.values()) {
            System.out.println(myVar);
        }
    }

}

