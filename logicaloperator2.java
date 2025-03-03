//test mark 50 ku mela irukanum and also u should be present to the class to "not write the assignment" 
//if any of the conditions failed "you should write the assignment".

import java.util.Scanner;
public class logicaloperator2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your test marks:");
        int test = scanner.nextInt();
        
        System.out.println("Enter your attendance(p/a):");
        scanner.nextLine();
        String attendance = scanner.nextLine();
        String a = "present";
        String b = "absent";
        if(attendance.equals(b) || test<50) //and kudukra maari na attendace.equals(present) && and test>50
        {
            System.out.println("Write the assignment.");
        }
        else{
            System.out.println("No need to Write the assignment.");
        }
    }
    
}

    
