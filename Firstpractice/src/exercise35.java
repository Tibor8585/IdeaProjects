public class exercise35 {
    public static void main(String[] args) {
        int[] age = {5, -3, 0, 21, 55, 18, 32, 255, 42};
        for (int i=0; i< age.length; i++){
            if(age[i]>=0 && age[i]<120){
                System.out.println("Reális életkorok: " + age[i]);
            }
        }
    }
}
