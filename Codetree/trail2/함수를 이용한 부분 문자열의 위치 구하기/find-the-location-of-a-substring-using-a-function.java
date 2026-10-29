import java.util.Scanner;
public class Main {
    public static String text;
    public static String pattern;

    public static boolean isMatch(int start) {
        if (start + pattern.length() > text.length()) {
            return false;
        }
        for (int j = 0; j < pattern.length(); j++) {
            if (text.charAt(start + j) != pattern.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        text = sc.next();
        pattern = sc.next();

        int result = -1;
        for (int i = 0; i < text.length(); i++) {
            if (isMatch(i)) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
