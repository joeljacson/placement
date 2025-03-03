import java.util.Scanner;

public class scanner2 
{
    public static void main (String [] args)
    {
        Scanner personal = new Scanner(System.in);
        
        String name = personal.nextLine();
        int age = personal.nextInt();
        personal.nextLine(); //using string next to int will take as empty so use obj.nextLine()
        String address = personal.nextLine();
        System.out.println("my name is" + name);
        System.out.println("my age is" + age);
        System.out.println("adress is" + address);
       

    }
}