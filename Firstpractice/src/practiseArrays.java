public class practiseArrays {
    public static void main(String[] args) {
        int[] firstArray = new int[5];   //tömb létrehozása méretének megadásával
        String[] firstArrayS = new String[2];   //tömb létrehozása méretének megadásával
        boolean[] firstArrayB = new boolean[1];   //tömb létrehozása méretének megadásával
        float[] firstArrayF = new float[1];   //tömb létrehozása méretének megadásával

        int[] secondArray = {34, 2, 222, 101, 1223, 0, 9}; //tömb létrehozása kezdőértékek megadásával
        boolean[] secondArrayB = {true, false, true, true}; //tömb létrehozása kezdőértékek megadásával
        String[] secondArrayS = {"Alma", "Körte", "Dinnye"}; //tömb létrehozása kezdőértékek megadásával
        float[] secondArrayF = {56f, 21f}; //tömb létrehozása kezdőértékek megadásával


        firstArray[0] = 11;   //beállítom a tömb első elemét 11-re
        secondArrayS[2] = "Eper";  //felülírom a tömb 3. elemét, ami a 2. indexen található (indexelés 0.-tól indul) Eper-re

        System.out.println(firstArray[0]);  //elkérem az firstArray tömb 0. elemét
        System.out.println(secondArrayS[0]);  //elkérem az secondArrayS tömb 0. elemét
        System.out.println(secondArrayS[1]);  //elkérem az secondArrayS tömb 1. elemét
        System.out.println(secondArrayS[2]);  //elkérem az secondArrayS tömb 2. elemét

        System.out.println(secondArrayS.length);  //a length segítségével el tudom kérni a tömbben lévő elemek darabszámát
        System.out.println(secondArray.length);  //a length segítségével el tudom kérni a tömbben lévő elemek darabszámát

        System.out.println("--------Cycles---------");
        int[] numbers = new int[20];
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }

        for(int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        int j = 11;
        for(int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[j]);
        }
    }
}
