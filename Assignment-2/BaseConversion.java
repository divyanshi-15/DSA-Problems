public class BaseConversion {
    public static void decToBin(int n){
        int ans=0,pow=0;
        while(n != 0){
            ans = (int)Math.pow(10, pow) * (n % 2)+ans;
            pow++;
            n = n/2;
        }
        System.out.println(ans);
    }
    public static void binToDec(int n){
        int ans=0,pow=0;
        while(n != 0){
            ans = (int)Math.pow(2, pow) * (n % 10)+ans;
            pow++;
            n= n/10;
        }
        System.out.println(ans);
    }
    public static void decToOctal(int n){
        int ans=0,pow=0;
        while(n != 0){
            ans = (int)Math.pow(10, pow) * (n % 8)+ans;
            pow++;
            n = n/8;
        }
        System.out.println(ans);
    }
    public static void octalToDec(int n){
        int ans=0,pow=0;
        while(n != 0){
            ans = (int)Math.pow(8, pow) * (n % 10)+ans;
            pow++;
            n = n/10;
        }
        System.out.println(ans);
    }
    public static void main(String args[]){
        decToBin(19);
        binToDec(10011);
        decToOctal(154);
        octalToDec(232);
    }
    
}
