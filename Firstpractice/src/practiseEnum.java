public class practiseEnum {
    public static void main(String[] args) {
        Level myvar = Level.MEDIUM;
        System.out.println(myvar);

        Day myVar2 = Day.FRIDAY;
        System.out.println(myVar2);

        for (Level myVar : Level.values()) {
            System.out.println(myVar);
        }

    }
    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }

    public enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
        THURSDAY, FRIDAY, SATURDAY
    }

    public enum Napok{
        HÉTFŐ, KEDD, SZERDA, CSÜTÖRTÖK, PÉNTEK, SZOMBAT, VASÁRNAP
    }
}
