import java.util.Scanner;

public class string3 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("what is vijay next movie?");
        String movie = obj.nextLine();
        String a = "jananayagam";

        if (movie.equals(a)) {
            System.out.println("watch movie");
        }
        else {
            System.out.println("go watch other movie");
        }
        obj.close();
    }
}
