public class string2 {
    public static void main(String[] args) {
        String a = new String ("raja");
        String b = "raja";
        String c = new String("raja");
        System.out.println(a==b);// address compare
        System.out.println(a==c);
        System.out.println(a.equals(b));
        System.out.println(a.equals(c)); // memory compare
    }
}
