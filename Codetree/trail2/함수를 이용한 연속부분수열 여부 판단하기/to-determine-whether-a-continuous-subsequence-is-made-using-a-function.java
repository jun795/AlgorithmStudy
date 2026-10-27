import java.util.Scanner;
public class Main {
    public static int n1;
    public static int n2;

    public static boolean isNum(int[] a, int[] b) {
        for (int i = 0; i <= n1 - n2; i++) {
            if (a[i] != b[0]) continue;
            boolean isSame = true;

            for (int j = 0; j < n2; j++) {
                if (a[i + j] != b[j]) {
                    isSame = false;
                    break;
                }
            }
            if (isSame) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n1 = sc.nextInt(); //수열 A의 원소 갯수
        n2 = sc.nextInt(); //수열 B의 원소 갯수
        int[] a = new int[n1]; //A 원소
        int[] b = new int[n2]; //B 원소
        for (int i = 0; i < n1; i++)
            a[i] = sc.nextInt();
        for (int i = 0; i < n2; i++)
            b[i] = sc.nextInt();

        if (isNum(a, b)) System.out.println("Yes");
        else System.out.println("No");

    }
}
