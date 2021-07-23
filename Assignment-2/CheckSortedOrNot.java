public class CheckSortedOrNot {
    public static void main(String[]args){
        int flag=0;
        int arr[]={13,25,45,55,62,79,2,94};
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]<arr[i])
                flag++;
        }
        if(flag==0){
            System.out.println("Sorted");
        }
        else{
            System.out.println("Not Sorted");
        }
    }
}
