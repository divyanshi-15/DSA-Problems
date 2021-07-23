public class reverseAnArr {
    public static void main(String[]args){
        int arr[]={4,1,75,9,8,6,0,2};
        int temp,l=0,h=arr.length-1;
        while(l<h){
            temp=arr[l];
            arr[l]=arr[h];
            arr[h]=temp;
            l++;
            h--;

        }
        for(int ele: arr){
            System.out.println(ele);
        }
    }    
}
