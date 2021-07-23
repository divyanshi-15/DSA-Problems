public class SortBinArr {
    public static void main(String[]args){
        int arr[]={0,1,0,1,1,0,1,0,1,1,1,0,0,0,1};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){ 
            if(arr[j]==1&&arr[j+1]==0){
                arr[j+1]=1;
                arr[j]=0;
            }
        }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
