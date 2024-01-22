public class exercise80Home {
    public static void main(String[] args) {
    String originalText= args[0];
    int lenghtOfCut= Integer.parseInt(args[1]);
    System.out.println(getPArtOfText(originalText, lenghtOfCut));
    }
    public static String getPArtOfText(String localOriginalText, int localLenghtOfCut){
        String finalText=localOriginalText.substring(0,localLenghtOfCut);
        return finalText;
    }

}
