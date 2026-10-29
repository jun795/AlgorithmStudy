import java.util.Scanner;
public class Main {
    public static String Palindrome(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        String reverse = Palindrome(input);
        if (input.equals(reverse)) {
            System.out.println("Yes");
        } else System.out.println("No");

    }
}
