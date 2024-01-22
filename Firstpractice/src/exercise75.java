import java.util.Arrays;
import java.util.List;
public class exercise75 {
    public static void main(String[] args) {
        List<String> execitonResultList = Arrays.asList("00171", "00181", "00190", "00200", "0021X", "00220");

        int passCount=0, failedCount=0, skipCount = 0;

        for (String execution : execitonResultList) {
            System.out.println(execution);
            char executionResult=execution.charAt(4);
            switch (executionResult) {
                case '1':
                    passCount++;
                    break;
                case '0':
                    failedCount++;
                    break;
                case 'X':
                    skipCount++;
                    break;
            }
        }
        System.out.println("Total test cases: " + execitonResultList.size());
        System.out.println("PASSED test executions: " + passCount);
        System.out.println("FAILED test executions: " + failedCount);
        System.out.println("SKIPPED test executions: " + skipCount);
        double passCountInDubble= passCount;
        System.out.println("Passed in %: " + passCountInDubble/ execitonResultList.size() * 100);
        System.out.println("Failed in %: " + (double) failedCount / execitonResultList.size()*100); // Kényszerítés
    }
}
