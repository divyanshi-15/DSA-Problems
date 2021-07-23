import java.util.*;
public class CfcA1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int credits;
        System.out.println("Enter the credits");
        credits = sc.nextInt();
        if(credits>=7500){
            System.out.println("Tera Leader");
        }
        else if(credits>=6000){
            System.out.println("Gega Leader");
        }
        else if(credits>=4500){
            System.out.println("Mega Leader");
        }
        else{
            System.out.println("Rising Star");
        }
    }
    
}
