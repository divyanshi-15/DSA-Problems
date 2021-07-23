import java.util.*;
public class CheckChar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char ch;
        System.out.println("Enter a character");
        ch = sc.next().charAt(0);
        if(ch>='A' && ch<='Z')
            System.out.println("Upper Case");
        else if(ch>='a' && ch<='z')
            System.out.println("Lower Case");
        else{
            System.out.println("Invalid Input");
        }    
    }
    
}
