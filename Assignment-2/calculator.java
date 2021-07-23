import java.util.*;
public class calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1,n2;
        char ch;
        System.out.println("Enter two numbers");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        System.out.println("Enter ch");
        ch = sc.next().charAt(0);
        switch(ch){
            case '*':
            System.out.println(n1*n2);
            break;
            case '/':
            System.out.println(n1/n2);
            break;
            case '%':
            System.out.println(n1%n2);
            break;
            case '+':
            System.out.println(n1+n2);
            break;
            case '-':
            System.out.println(n1-n2);
            break;
            default:
            System.out.println("invalid input");
        }
    }
}
