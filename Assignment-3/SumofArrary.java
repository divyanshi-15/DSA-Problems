import java.util.*;
public class SumofArrary {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,m;
        System.out.println("Enter length and elements of first array");
        n=sc.nextInt();
        int arr1[]=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter length and elements of second array");
        m=sc.nextInt();
        int arr2[]=new int[m];
        for(int i=0;i<m;i++){
            arr2[i]=sc.nextInt();
        }
        int sum[] = new int[(int) Math.max(arr1.length, arr2.length)];
        for (int i = 0; i < sum.length; i++) {
            if (arr1.length > i) {
                sum[i] += arr1[i];
            }
            if (arr2.length > i) {
                sum[i] += arr2[i];
            }
        }
        for(int ele:sum){
            System.out.print(ele+" ");
        }
    }
}
