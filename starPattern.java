public class StarPattern {
    public static void main(String[] args) {
        int rows = 3; // Number of rows
        int i = 1;

        do {
            int j = 1;
            do {
                System.out.print("*");
                j++;
            } while (j <= i);

            System.out.println(); // Move to the next line
            i++;
        } while (i <= rows);
    }
}
