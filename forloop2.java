import java.util.Scanner; //getting n number from user and checking div using if 
public class forloop2 {
   public static void main(String[] args) {
       Scanner kartthi = new Scanner(System.in);
       int n=kartthi.nextInt();
       System.out.println("the following numbers are");
       for(int i=1;i<=n;i++){
        
        if(i%3==0 && i%5==0){
            
            System.out.println(i);
        }
       }
   } 
}
