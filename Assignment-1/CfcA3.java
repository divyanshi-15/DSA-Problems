import java.util.*;
public class CfcA3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,b,gcd=0;
        System.out.println("Enter two numbers");
        a = sc.nextInt();
        b = sc.nextInt();
        for(int i=1; i<=a && i<=b; i++){
            if(a%i==0 && b%i==0)
                gcd=i;
        }
        System.out.println("GCD is:"+gcd);
    }
    
}
