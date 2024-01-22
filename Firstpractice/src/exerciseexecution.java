public class exerciseexecution {
    public static void main(String[] args) {
        System.out.println("Program execution started");
        try {

            System.out.println(args[1]);
        }catch (Exception e){
            System.out.println("No luck " + e);
        }

        System.out.println("Program execution end");
    }

}
