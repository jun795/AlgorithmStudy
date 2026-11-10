import java.util.Scanner;

public class Main {
    public static int pivot(int n){
        if(n == 1 || n == 2){
            return 1;
        }

        return pivot(n-1) + pivot(n-2);
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int result = pivot(n);
        System.out.println(result);
    }
}