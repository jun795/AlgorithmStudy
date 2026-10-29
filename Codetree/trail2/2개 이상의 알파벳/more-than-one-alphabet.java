import java.util.Scanner;
public class Main {
    public static boolean isDiff(String str){
        for(int i=0; i<str.length(); i++){
            if(str.charAt(0) != str.charAt(i)){
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        
        if(isDiff(A)) System.out.println("Yes");
        else System.out.println("No");
    }
}