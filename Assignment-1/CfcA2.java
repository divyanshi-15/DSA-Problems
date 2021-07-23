import java.util.*;
public class CfcA2 {
    public static void main(String[] args){
        int amt,r,t,si;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount, rate & time");
        amt = sc.nextInt();
        r = sc.nextInt();
        t = sc.nextInt();
        si = (amt*r*t)/100;
        System.out.println("Simple Interest :"+si);

    }
    
}
