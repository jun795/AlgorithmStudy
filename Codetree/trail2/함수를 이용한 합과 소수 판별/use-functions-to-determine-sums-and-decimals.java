import java.util.Scanner;
public class Main {
    public static boolean magicNum(int num) { //소수 판별
        for (int i = 2; i < num; i++) { //소수는 1과 자기자신으로만 나눠져야함
            if (num % i == 0) { //만약 2~자기자신 사이의 값으로 나눠지면
                return false; //소수가 아님
            }
        }
        return true;
    }
    public static int plus(int num) { //자릿수의 합
        String number = Integer.toString(num); //입력값을 문자열로 변환
        int sum = 0;
        for (int i = 0; i < number.length(); i++) {
            sum += number.charAt(i);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int cnt = 0;
        for (int i = a; i <= b; i++) {
            if (magicNum(i) && plus(i) % 2 == 0) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
