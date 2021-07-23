import java.util.*;
public class ReverseAnum {
    public static void main(String[] args){
        int n,rev=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        n = sc.nextInt();
        while(n!=0){
        rev=rev*10 + n%10;
        n=n/10;
        }
        System.out.println(rev);
    }
    
}
