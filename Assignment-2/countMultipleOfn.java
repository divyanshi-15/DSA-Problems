import java.util.*;
public class countMultipleOfn {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("Enter elements of the array:");
        for(int i = 0;i < arr.length;i++){
           arr[i] = sc.nextInt();
        }
        int c=0;
        for(int i = 0;i < arr.length;i++){
            if(arr[i]%5==0)
                c++;      
        }
        System.out.println( "count"+c);  
    }
}
