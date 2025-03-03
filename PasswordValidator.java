import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password;

        do {
            System.out.print("Enter a password: ");
            password = scanner.nextLine();

            if (password.isEmpty()) {
                System.out.println("Error: Password cannot be empty.");
            } else if (password.length() < 6) {
                System.out.println("Error: Password must be at least 6 characters long.");
            }

        } while (password.isEmpty() || password.length() < 6);

        System.out.println("Password accepted.");
        scanner.close();
    }
}
