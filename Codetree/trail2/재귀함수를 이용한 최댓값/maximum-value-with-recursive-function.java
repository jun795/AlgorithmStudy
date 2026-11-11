import java.util.Scanner;
public class Main {
    public static int[] arr;
    public static int findMax(int n) {
        //종료조건
        if (n == 1) {
            return arr[0];
        }

        //실행조건
        int max = findMax(n - 1);
        return Math.max(arr[n - 1], max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = findMax(n);
        System.out.println(result);

    }
}
