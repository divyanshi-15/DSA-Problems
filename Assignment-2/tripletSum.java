import java.util.*;
public class tripletSum {
    public static void checkTripletSum(int arr[],int target){
           for(int i=0;i<arr.length;i++){
               for(int j=i+1;j<arr.length;j++){
                   for(int k=j+1;k<arr.length;k++){
                   if(arr[i]+arr[j]+arr[k]==target){
                       System.out.println(arr[i]+","+arr[j]+","+arr[k]);
                   }
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
        checkTripletSum(arr,target);

    }
}