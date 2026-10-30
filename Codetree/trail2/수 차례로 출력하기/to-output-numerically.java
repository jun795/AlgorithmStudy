import java.util.Scanner;
public class Main {
    public static void printInt(int n) {
        if (n == 0) return;

        printInt(n - 1);
        System.out.print(n + " ");
    }

    public static void printInt2(int n) {
        if (n == 0) return;

        System.out.print(n + " ");
        printInt2(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        printInt(n);
        System.out.println();
        printInt2(n);
    }
}
