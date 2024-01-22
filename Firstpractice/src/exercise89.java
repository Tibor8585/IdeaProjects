import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class exercise89 {
    public static void main(String[] args) {
       String res = convertProgramArgumentsToString(args);
        System.out.println(res);
        writeToFile(res);
    }
    public static void writeToFile(String content){
        try {
            Files.write(Paths.get("used_arguments.txt"), content.getBytes("UTF-8"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String convertProgramArgumentsToString(String[] arguments){
        String result="Arguments are the following" + System.lineSeparator();
        for(int i=0; i< arguments.length; i++){
            result+=arguments[i]+System.lineSeparator();
        }
        return result;
    }
}
