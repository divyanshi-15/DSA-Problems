import java.util.*;
public class countPrimeNum {
    public static boolean isPrime(int n){
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static int countPrime(int [] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("Enter elements of the array:");
        for(int i = 0;i < arr.length;i++){
           arr[i] = sc.nextInt();
        }
        System.out.println("Count:"+ countPrime(arr));
    }
}   