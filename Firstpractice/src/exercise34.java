public class exercise34 {
    public static void main(String[] args) {
        int[] number = new int[21];

        int index= 0;

        for(int i=1; i<= 21; i++){
            number[index]=i;
                    index++;
        }
        for (int i= number.length-1; i>=0; i--){
            System.out.print(number[i] + ", ");
        }

    }
}
