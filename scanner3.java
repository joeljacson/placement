import java.util.Scanner;

public class scanner3 {
    public static void main(String[] args) {
        Scanner subject = new Scanner(System.in);
        int spc = subject.nextInt();  
        int cbt = subject.nextInt();  
        int oose = subject.nextInt();  
        int ns = subject.nextInt();  
        int arvr = subject.nextInt();  
        System.out.println("Marks scored in spc ="  + spc);  
        System.out.println("Marks scored in cbt = "   + cbt);  
        System.out.println("Marks scored in oose =  "   + oose);  
        System.out.println("Marks scored in arvr =  "  + arvr);  
        System.out.println("Marks scored in ns =  "   + ns);  
        int totalmarks = spc+ns+oose+arvr+cbt;
        System.out.println("Total marks = " + totalmarks); 
        int average = totalmarks/5 ; 
        System.out.println("Average =" + average);
    
    
    }
}