import java.util.Scanner;

public class exercise106 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give me the actual score: ");
        int actualScore = scan.nextInt();
        System.out.println("A minimum pontszám a vizsga teljesítéséhez " + args[0]);
        int minScore = Integer.parseInt(args[0]);
        if(actualScore>=minScore){
            System.out.println("Your exam: " + ExamStatus.PASSED);
        }else {
            System.out.println("Your exam: " + ExamStatus.FAILED);
        }
    }
    enum ExamStatus{
        PASSED, FAILED
    }
}
