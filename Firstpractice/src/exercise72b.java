import java.util.Arrays;
import java.util.List;

public class exercise72b {
    public static void main(String[] args) {
        List<String> companies = Arrays.asList(
                "Zuckerberg,4", "Steve,4", "Bill,1", "Bill,2", "Zuckerberg,4", "Bill,2",
                "Zuckerberg,1", "Zuckerberg,3", "Zuckerberg,1", "Zuckerberg,1", "Steve,4",
                "Bill,2", "Zuckerberg,3", "Bill,2", "Zuckerberg,4", "Steve,1",
                "Bill,3", "Steve,2", "Steve,2", "Bill,1", "Zuckerberg,4",
                "Bill,4", "Steve,4", "Bill,2", "Bill,3", "Zuckerberg,3",
                "Steve,4", "Zuckerberg,4", "Bill,2", "Zuckerberg,3"
        );
        // "Zuckerberg,4"
        // String name = "Zuckerberg";
        // int compCount = 4;

        int result = 0;
        for (String company : companies) {
            String[] companyArray = company.split(",");
            System.out.println(companyArray[1]);
            result += Integer.parseInt(companyArray[1]);
        }

        System.out.println("Total number of comanies: " + result);
    }
    }


