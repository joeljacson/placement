//array- collection of similar data type
//data type array name = new datatype[size] 
//create an integer array ,get input for 5 numbers and print the sum 
import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[5]; //memory start from 0
        System.out.println("enter the number");
        for(int i=0;i<=array.length-1;i++){ //using for loop to get 1 to 4 values
            array[i] = scan.nextInt();
        }
       
        System.out.println("the total is:" + (array[0]+array[1]+ array[2]+array[3]+array[4]));
    }

}
/* array[0] = scan.nextInt();
        array[1] = scan.nextInt();
        array[2] = scan.nextInt();
        array[3] = scan.nextInt();
        array[4] = scan.nextInt();
 */