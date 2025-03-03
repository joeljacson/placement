//if kula ennoru conidtion venum na nested if
//if elame neraiya condition ku else if 
import java.util.Scanner;
public class nestedif {
    public static void main(String[] args) {
         Scanner scholar = new Scanner(System.in);
         System.out.println("enter your gpa");
         double gpa = scholar.nextDouble();
         System.out.println("enter your finanicial need true/false?");
         boolean financialneed = scholar.nextBoolean();

    if(gpa>8.5){
        if(financialneed){
            System.out.println("your eligible for full scholarship");
        }
        else{
            System.out.println("you are eligible for merit scholarship");
        }
    }
    else if (gpa>6.0) {
        if(financialneed){
            System.out.println("your are eligible for partial scholarship as per your financial need");
        }
        else{
            System.out.println("you didnt get any scholarship");
        }
    }
    else{
        System.out.println("your are not eligibe for scholarship");
    }
    }
}
