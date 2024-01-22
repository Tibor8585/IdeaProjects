import java.util.Scanner;

public class exercise78begyenlo {
    public static void main(String[] args) {
        String words;
        String contain;
        Scanner scan = new Scanner(System.in);

        if (args.length!=0) {
            words = args[0].trim();
            contain = args[1].trim();
        } else {
            System.out.println("Adja meg az első szót.");
            words = scan.nextLine();
            System.out.println("Adja meg a második szót.");
            contain = scan.nextLine();
        }
        checkWord(words, contain);
    }

    public static Boolean checkWord(String words, String contain) {
    boolean answer;
    if (words.startsWith(contain)){
        answer = true;
    }else {
        answer = false;
    }

        return answer;
    }
}


