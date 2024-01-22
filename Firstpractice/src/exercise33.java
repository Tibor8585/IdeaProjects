public class exercise33 {
    public static void main(String[] args) {
        String[] carsArray = {"Mercedes", "Kia", "Ferrari", "Alfa"};
        String myFavoriteCAr= "Ferrari";

        for (int i = 0; i<carsArray.length;i++){
            if (carsArray[i].equals(myFavoriteCAr)){
                System.out.println(carsArray[i] + "a kedvencem.");
                break;
            }

        }
    }
}
