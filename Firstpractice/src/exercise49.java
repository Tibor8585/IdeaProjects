import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class exercise49 {
    public static void main(String[] args) {
        Set<String> moviesList = new HashSet<>();
        Scanner scan = new Scanner(System.in);
        for (int i=0; i<5; i++){
            System.out.println("Kedvenc film: ");
            String favoriteMovies= scan.nextLine();
            moviesList.add(favoriteMovies);
        }
        System.out.println("A kedvenc filmeim: ");
        for (String movies: moviesList){
            System.out.println(movies);
        }
    }
}
