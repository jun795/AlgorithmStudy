import java.util.Scanner;
public class Main {
    // public static int cnt = 0;
    // public static int div(int n) {
    //     if (n == 1) {
    //         return cnt;
    //     }

    //     if (n % 2 == 0) {
    //         cnt++;
    //         return div(n / 2);
    //     } else {
    //         cnt++;
    //         return div(n / 3);
    //     }
    // }
    public static int div(int n){
        if(n == 1){
            return 0;
        }

        if(n % 2 == 0){
            return 1 + div(n/2);
        }else{
            return 1 + div(n/3);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int num = div(n);
        System.out.println(num);
    }
}
