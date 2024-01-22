import java.util.ArrayList;
import java.util.List;

public class exercise70String {
    public static void main(String[] args) {
        List<String>listNames=getListWithNames();
        List<String>transformnames=transformListToUpperCase(listNames);
        printListToConsole(transformnames);

    }
    public static List<String>getListWithNames(){
        List<String> listWithNames = new ArrayList<>();
        listWithNames.add("Béla");
        listWithNames.add("Ilona");
        listWithNames.add("Gábor");
        return listWithNames;
    }
    public static List<String>transformListToUpperCase(List<String>localNames){
        List<String> upperNameList=new ArrayList<>();
        for(String name: localNames){
            upperNameList.add(name.toUpperCase());
        }
        return upperNameList;
    }
    public static void printListToConsole(List<String>localList){
        System.out.println(localList);
    }
}
