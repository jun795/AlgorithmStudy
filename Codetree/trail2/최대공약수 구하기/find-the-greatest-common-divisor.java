import java.util.Scanner;

public class Main {
    public static void max(int n, int m) {
        int ans = Math.min(n, m); //둘 중 작은 수를 기준
        while (true) {
            if ((n % ans == 0) && (m % ans == 0)) {
                System.out.println(ans);
                break;
            }
            ans--; //큰수부터 차감하며 계산
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        max(n, m);
    }
}
