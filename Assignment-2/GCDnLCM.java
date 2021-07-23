import java.util.*;
public class GCDnLCM {
    public static void gcd(int a,int b){
        int ans = 0;
        for(int i=2;i<=a && i<=b;i++){
              if(a % i ==0 && b % i ==0)
                  ans = i;
        }
        System.out.println("GCD is "+ ans);
    }
    public static void lcm(int a,int b){
       int i,max;
       max = (int)Math.max(a,b);
       while(true){
           if(max % a == 0 && max % b == 0){
               System.out.println("LCM is "+max);
               break;
           }
           max++;
       }
    }
    public static void main(String[]args){
        int a,b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        gcd(a,b);
        lcm(a,b);

    }
}
