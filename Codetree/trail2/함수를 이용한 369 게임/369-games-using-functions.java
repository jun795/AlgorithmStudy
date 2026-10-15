import java.util.Scanner;
public class Main {
    public static boolean isMagicNum(int A){
        String strA = Integer.toString(A);
        if(A % 3 == 0) return true;
        for(int i=0; i<strA.length(); i++){
            if(strA.charAt(i) == '3' || strA.charAt(i) == '6' || strA.charAt(i) == '9'){
                return true;
            }
        }
        return false;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        int cnt = 0;
        for(int i=A; i<=B; i++){
            if(isMagicNum(i)) cnt++;
        }
        System.out.println(cnt);
    }
}