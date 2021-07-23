import java.util.*;
public class CfcA5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n, count=0;
        System.out.println("Enter the number");
        n= sc.nextInt();
        while(n!=0){
            n=n/10;
            count++;
        }
        System.out.println("The number of digits:"+count);
    }
    
}
