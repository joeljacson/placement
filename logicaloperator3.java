//need to gave credict limit for user according to their transcation amount using and operator
//more condition so using else if 

import java.util.Scanner;

public class logicaloperator3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            
            System.out.print("Enter your transaction/year amount: ");
            long transactionAmount = scanner.nextLong();
    
            
            long creditLimit;
            if (transactionAmount >= 0 && transactionAmount <= 100000) {
                creditLimit = 0;
            } else if (transactionAmount >= 100001 && transactionAmount <= 300000) {
                creditLimit = 50000;
            } else if (transactionAmount >= 300001 && transactionAmount <= 500000) {
                creditLimit = 200000;
            } else if (transactionAmount >= 500001 && transactionAmount <= 1000000) {
                creditLimit = 500000;
            } else {
                creditLimit = 1000000;
            }
    
            
            System.out.println("Your assigned credit limit is: " + creditLimit);
            
            scanner.close();
        }
    
    
    
}


