import java.util.Scanner;
public class Main {
    public static boolean leapYear(int y) {
        if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) {
            return true;
        } else return false;
    }

    public static boolean isIn(int y, int m, int d) {
        //윤년이라면
        if (leapYear(y)) {
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
                    if (1 <= d && d <= 29) isD = true;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    if (1 <= d && d <= 30) isD = true;
                    break;
            }
            return isD;
            //평년이라면
        } else {
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
    }

    public static String season(int m) {
        if (3 <= m && m <= 5) {
            return "Spring";
        } else if (6 <= m && m <= 8) {
            return "Summer";
        } else if (9 <= m && m <= 11) {
            return "Fall";
        } else return "Winter";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();

        if (isIn(y, m, d)) {
            System.out.println(season(m));
        } else System.out.println(-1);

    }
}
