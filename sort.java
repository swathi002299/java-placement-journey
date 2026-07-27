public class sort{
    public static void main(String[] args){
        int arr[]={1,2,4,3,5,6};
        int n=6;
        boolean sorted=true;
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
               sorted=false;
            }
        }
        if(sorted){
            System.out.println("array is sorted");
        }
        else{
            System.out.println("array is not sorted");
        }
    }
}