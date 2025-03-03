import java.util.Random;
import java.util.Scanner;

public class SumOfNumbers{
  public static void main (String[]args){

    Scanner scanner=new Scanner(System.in);
    System.out.print("Enter a number");
    int n= scanner.nextInt();

    Random rand = new Random();
    int num=0;
    while(num!=n){
        num=rand.nextInt(101);
            System.out.print(num +",");
            num++;

    }
    scanner.close();
    
      }

}