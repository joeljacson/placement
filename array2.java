import java.util.Scanner;
public class array2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the array size");
        int n = scan.nextInt(); //getting size from the user
        int[] array = new int[n]; //memory start from 0
        System.out.println("enter the number");
        for(int i=0;i<n;i++){ //using for loop to get 1 to 4 values
            array[i] = scan.nextInt();
        }
        int sum = 0;
        for(int i =0;i<n;i++){
            sum = sum+array[i];
            
        }
        System.out.println("the total value is:" + sum);
        
       
        //System.out.println("the total is:" + (array[0]+array[1]+ array[2]+array[3]+array[4]));
    }

}