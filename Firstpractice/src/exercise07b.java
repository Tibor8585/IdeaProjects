public class exercise07b {
    public static void main(String[] args) {
        int userday = Integer.parseInt(args[0]);

        if (userday == 4 || userday == 5 || userday==6){
            System.out.println("Italos nap van.");
        }else {System.out.println("Ez nem a te napod");
        }
    }
}
