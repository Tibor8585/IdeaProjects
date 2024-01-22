import java.util.Arrays;
import java.util.List;

public class exercise72homeCégesösszegzős {
    public static void main(String[] args) {
        List<String> companies = Arrays.asList(
                "Zuckerberg,4", "Steve,4", "Bill,1", "Bill,2", "Zuckerberg,4", "Bill,2",
                "Zuckerberg,1", "Zuckerberg,3", "Zuckerberg,1", "Zuckerberg,1", "Steve,4",
                "Bill,2", "Zuckerberg,3", "Bill,2", "Zuckerberg,4", "Steve,1",
                "Bill,3", "Steve,2", "Steve,2", "Bill,1", "Zuckerberg,4",
                "Bill,4", "Steve,4", "Bill,2", "Bill,3", "Zuckerberg,3",
                "Steve,4", "Zuckerberg,4", "Bill,2", "Zuckerberg,3");
        int sumOfCompanies = 0;
        for(String company : companies){
            String[] data = company.split(",");
            int numbersOfCompanies = Integer.parseInt(data[1]);
            sumOfCompanies+= numbersOfCompanies;
        }
        System.out.println("Összesen ennyi céget vásároltak fel: " + sumOfCompanies);
    }

}
