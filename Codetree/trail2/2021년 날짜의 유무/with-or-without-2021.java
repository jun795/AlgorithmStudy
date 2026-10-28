import java.util.Scanner;
public class Main {
    public static boolean isIn(int m, int d) {
        boolean isD = false;
        switch (m) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (1 <= d && d <= 31) isD = true;
                break;
            case 2:
                if (1 <= d && d <= 28) isD = true;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (1 <= d && d <= 30) isD = true;
                break;
        }
        return isD;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int d = sc.nextInt();

        if (isIn(m, d)) System.out.println("Yes");
        else System.out.println("No");
    }
}
