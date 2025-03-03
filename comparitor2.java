import java.util.Scanner;
public class comparitor2 {
    public static void main(String[] args){
    Scanner kartthi = new Scanner(System.in);
    System.out.println("enter the 1st number");
    int num1 = kartthi.nextInt();
    System.out.println("enter the 2nd number");
    int num2 = kartthi.nextInt();

if(num1 == num2){
    System.out.print("both numbers are equals");
}
else{
    System.out.print("both are not equals");
}

 }
}