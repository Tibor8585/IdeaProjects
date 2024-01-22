public class exercise32 {
    public static void main(String[] args) {
        int[] evenNumbers = new int[50];
        int evenNumbersIndex = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                evenNumbers[evenNumbersIndex] = i;
                evenNumbersIndex++;
            }
        }
        for(int j = 0; j < evenNumbers.length; j++){
            System.out.print(evenNumbers[j] + " ");
        }
    }
}

