public class exercise61 {
    public static void main(String[] args) {
        ageFilter(10);
        ageFilter(19);
        ageFilter(50);
    }
    public static void ageFilter(int age){
      if (age>18){
          System.out.println("Jogosult vagy belépni.");
      }else {
          System.out.println("Takarodj.");
      }
    }
}
