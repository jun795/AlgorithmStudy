import java.util.Scanner;

public class Main {
    public static boolean isPrime(int num){
        for(int i=2; i<num; i++){ //소수 판별
            if(num % i == 0){ //자신보다 작은 수로 나눠지면
                return false; //소수가 아님
            }
        }
        return true; //조건에 걸리지 않으면 소수임
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int sum = 0;
        for(int i=a; i<=b; i++){
            if(isPrime(i)){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}