import java.util.Random;

public class exercise31 {
    public static void main(String[] args) {
        /*
        Random random = new Random();
        int randomNumber1 = random.nextInt(1, 91);
        int randomNumber2 = random.nextInt(1, 91);
        int randomNumber3 = random.nextInt(1, 91);
        int randomNumber4 = random.nextInt(1, 91);
        int randomNumber5 = random.nextInt(1, 91);


        int[] randomArrayNumber = new int[5];
        randomArrayNumber[0] = randomNumber1;
        randomArrayNumber[1] = randomNumber2;
        randomArrayNumber[2] = randomNumber3;
        randomArrayNumber[3] = randomNumber4;
        randomArrayNumber[4] = randomNumber5;

        System.out.print(randomArrayNumber[0] + " ");
        System.out.print(randomArrayNumber[1] + " ");
        System.out.print(randomArrayNumber[2] + " ");
        System.out.print(randomArrayNumber[3] + " ");
        System.out.print(randomArrayNumber[4] + " ");

         */
        Random random = new Random();
        int[] randomArrayNumber = new int[5];
        int count = 0;
        while (count <5){
            randomArrayNumber[count]= random.nextInt(1, 91);
            count++;
        }
        for (int i= 0; i<randomArrayNumber.length;i++){
            System.out.println(randomArrayNumber[i]);
        }
    }
}
