public class exercise78b {
    public static void main(String[] args) {
        String string = args[0];
        String contain = args [1];
        boolean answer = isContains(string,contain);
        System.out.println(answer);


    }
    public static boolean isContains(String localString, String localContain){
        String localS = localString.trim();
        String localC = localContain.trim();
        if(localS.startsWith(localC)){
            System.out.println("Ez a szöveg szerepel benne.");
            return true;
        }else {
            return false;
        }
    }
}
