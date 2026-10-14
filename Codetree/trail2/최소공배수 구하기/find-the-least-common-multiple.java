import java.util.Scanner;

public class Main {
    public static int n;
    public static int m;

    public static int minMulti(int n, int m) {
        int minNum = Math.min(n, m);
        int maxNum = Math.max(n, m);
        int i = 1;
        while (true) {
            if((maxNum*i) % minNum == 0){
                return (maxNum*i);
            }
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        int ans = minMulti(n, m);
        System.out.println(ans);
    }
}
