public class sortOddnEven {
    public static void sort(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]%2!=0 && arr[j+1]%2==0){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int ele: arr){
            System.out.println(ele);
        }

    }
    public static void main(String[]args){
        int arr[]={3,8,5,13,6,12,18,5};
        sort(arr);
    }
    
}
