import java.util.Scanner;
public class Main {
    public static boolean isMagicNum(int n) {
        //1. n이 짝수
        //2. 각 자리 숫자 합이 5의 배수
        int first = n / 10;
        int second = n % 10;

        return n % 2 == 0 && (first + second) % 5 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(isMagicNum(n)){
            System.out.println("Yes");
        }else System.out.println("No");
    }
}
