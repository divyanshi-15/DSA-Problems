public class HorizontalWave2D {
        public static void main(String[]args){
            int arr[][]={{11,12,13,14},{21,22,23,24},{31,32,33,34},{41,42,43,44}};
            int tle= arr.length*arr[0].length;
            int sr=0,sc=0,er=arr.length-1 ,ec=arr[0].length-1;
            int dir=0;
            while(tle!=0){
            if(dir==0){
                for(int i=sc;i<=ec;i++){
                    System.out.print(arr[sr][i]+" ");
                    tle--;
                }
                sr++;
                dir++;
            }
            if(dir==1){
                    for(int i=ec;i>=sc;i--){
                        System.out.print(arr[sr][i]+" ");
                        tle--;
                    }
                    sr++;
                    dir--;
            }
            }
        }
        
    }
