public class leftrotation{
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6,7,8,9};
        int first=arr[0];
        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
           arr[arr.length-1]=first;
           System.out.println("array after left rotation ");
           for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
           }
    }
}