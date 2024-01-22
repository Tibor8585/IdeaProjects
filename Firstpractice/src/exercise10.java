public class exercise10 {
    public static void main(String[] args) {
        int number = 1;
        int result = number;
        while(number<=10){
            result = result*number;
            number++;
        }
        System.out.println("Result: " + result);
    }
}
