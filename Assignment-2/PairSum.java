import java.util.*;
public class PairSum {
    public static void checkPairSum(int arr[],int target){
           for(int i=0;i<arr.length;i++){
               for(int j=i+1;j<arr.length;j++){
                   if(arr[i]+arr[j]==target){
                       System.out.println(arr[i]+","+arr[j]);
                   }
               }
           }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[]=new int[10];
        int target;
        System.out.println("Enter the values in an array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target value");
        target=sc.nextInt();
        checkPairSum(arr,target);

    }
}
