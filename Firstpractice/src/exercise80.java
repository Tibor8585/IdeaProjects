public class exercise80 {
    public static void main(String[] args) {

        System.out.println(getPArtOfText(args[0],Integer.parseInt(args[1])));
    }
    public static String getPArtOfText(String text, int count){
   if (count>=text.length()){
       return "error";
   }else {
       return text.substring(0,count);
   }
    }
   }

