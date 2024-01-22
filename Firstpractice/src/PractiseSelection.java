public class PractiseSelection {
    public static void main(String[] args) {
        System.out.println("Hello");

        int carprice = 10000;
        if (carprice < 1111) {
            System.out.println("carPrice is less than 1111 eur");
        }
        int motorPrice = 450;
        if (motorPrice < 400){
            System.out.println("Hurray I can buy the motor");
        }else{
            System.out.println("There is no enough money");
            System.out.println("try to save more...");
        }
        int housePrice = 120000;
        if (110000 > housePrice){
            System.out.println("I buy it!");
        }else if (housePrice > 110000 && housePrice < 130000){
            System.out.println("Could you give it  to me for 110000");
        }else {
            System.out.println("To expensive.");
        }

        System.out.println("examples end");
    }
}
