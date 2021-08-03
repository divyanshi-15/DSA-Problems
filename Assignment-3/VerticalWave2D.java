public class VerticalWave2D {
    public static void main(String[]args){
        int arr[][]={{11,12,13,14},{21,22,23,24},{31,32,33,34},{41,42,43,44}};
        int tle= arr.length*arr[0].length;
        int sr=0,sc=0,er=arr.length-1 ,ec=arr[0].length-1;
        int dir=0;
        while(tle!=0){
        if(dir==0){
            for(int i=sr;i<=er;i++){
                System.out.print(arr[i][sc]+" ");
                tle--;
            }
            sc++;
            dir++;
        }
        if(dir==1){
                for(int i=er;i>=sr;i--){
                    System.out.print(arr[i][sc]+" ");
                    tle--;
                }
                sc++;
                dir--;
        }
        }
    }
    
}
