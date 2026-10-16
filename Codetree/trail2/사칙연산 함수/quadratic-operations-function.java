import java.util.Scanner;
public class Main {
    public static int plus(int a, int c){
        return a + c;
    }
    public static int minus(int a, int c){
        return a - c;
    }
    public static int div(int a, int c){
        return a / c;
    }
    public static int multi(int a, int c){
        return a * c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char o = sc.next().charAt(0);
        int c = sc.nextInt();
        
        int ans = 0;
        if(o == '+'){
            System.out.printf("%d %s %d =", a, o, c);
            System.out.println(" " + plus(a, c));
        }else if(o == '-'){
            System.out.printf("%d %s %d =", a, o, c);
            System.out.println(" " + minus(a, c));
        }else if(o == '/'){
            System.out.printf("%d %s %d =", a, o, c);
            System.out.println(" " + div(a, c));
        }else if(o == '*'){
            System.out.printf("%d %s %d =", a, o, c);
            System.out.println(" " + multi(a, c));
        }else{
            System.out.println("False");
        }
    }
}