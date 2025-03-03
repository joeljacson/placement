//switch neriya condition kuduthu athula check panalam.
//check la entha case iruko athula iruka statement print aki thn switch break akum     
import java.util.Scanner;
public class switchcase {
    public static void main(String[] args) {
        Scanner score = new Scanner(System.in);
        System.out.println("enter your marks");
        int marks = score.nextInt();
        char grade; //initial pani atha case la use pandrom 
   switch (marks/10) {
       case 10 :
       case 9:
          grade = 'A';
            break;
        case 8:
        grade ='B';
        break;
        case 7:
        grade ='C';
        break;
        case 6:
        grade = 'D';
        break;
       default:
           grade ='E';
   }
   System.out.println("your grade  is :"   +   grade);
   score.close();
    }
    
}
