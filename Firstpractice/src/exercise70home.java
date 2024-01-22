import java.util.ArrayList;
import java.util.List;

public class exercise70home {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        List<String> upperCaseNames = new ArrayList<>();
        names.add("Béla");
        names.add("János");
        names.add("Ildikó");
        for(String name : names){
            String modifiedName = name.toUpperCase();
           upperCaseNames.add(modifiedName);
        }
        System.out.println(upperCaseNames);
    }
}
