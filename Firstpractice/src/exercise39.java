import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercise39 {
    public static void main(String[] args) {
        List<String> movies = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i <5; i++){
            System.out.println("Melyik a " + (i+1) + "kedvenc filmed?");
            String movieFromConsole=sc.nextLine();
            if(movies.contains(movieFromConsole)){
                System.out.println("Ez már benne van.");
                i--;
            }else{movies.add(sc.nextLine());}

        }
        for (String currentMovie: movies){
            System.out.print(currentMovie + ", ");
        }
    }
}
