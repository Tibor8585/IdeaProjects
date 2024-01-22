import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class exercise75tesztesetek {
    public static void main(String[] args) {
        List<String> testList = Arrays.asList("00171", "00181", "00190", "00200", "0021X", "00220");
        int pass = 0, skip = 0, failed = 0;
        for (String cases : testList){
            if (cases.endsWith("1")){
                pass++;
            }else if(cases.endsWith("X")){
                skip++;
            }else if(cases.endsWith("0")){
                failed++;
            }
        }
        System.out.println("Ennyi teszt került futtatásra: " + testList.size());
        System.out.println("A sikeres tesztesetek száma: " + pass);
        System.out.println("A skippelt tesztesetek száma: " + skip);
        System.out.println("A sikertelen tesztesetek száma: " + failed);
    }
}
