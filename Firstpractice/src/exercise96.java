import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class exercise96 {
    public static void main(String[] args) {
        List<String> data = readDataFromFile();
        String text = executionReport(data);
        writeToFile(text);

    }
   public static List <String> readDataFromFile(){
       List<String> readFrom = new ArrayList<>();
        try {
            readFrom = Files.readAllLines(Paths.get("src/resources/testexecutionresults.txt"));
       } catch (IOException e) {
           throw new RuntimeException(e);
       }
        return readFrom;
   }

   public static String executionReport(List<String> execitonResultList){
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
       String text = "";

       text+="Total test cases: " + execitonResultList.size() + System.lineSeparator();
       text+="PASSED test executions: " + passCount  + System.lineSeparator();
       text+="FAILED test executions: " + failedCount  + System.lineSeparator();
       text+="SKIPPED test executions: " + skipCount  + System.lineSeparator();
       double passCountInDubble= passCount;
       text+="Passed in %: " + passCountInDubble/ execitonResultList.size() * 100  + System.lineSeparator();
       text+="Failed in %: " + (double) failedCount / execitonResultList.size()*100  + System.lineSeparator();

       return text;
   }

   public static void writeToFile(String localText){
       try {
           new File("savedFiles/testexecutionreport.txt");
           String content = localText;
           Files.write(Paths.get("savedFiles/testexecutionreport.txt"), content.getBytes("UTF-8"), StandardOpenOption.APPEND);
       } catch (IOException e) {
           throw new RuntimeException(e);
       }
   }
}
