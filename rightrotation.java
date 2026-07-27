public class rightrotation{
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6,7,8,9};
        int last=arr.length;
        for(int i=arr.length-1;i<0;i--){
            arr[i]=arr[i-1];
        }
           arr[0]=last;
           System.out.println("array after left rotation ");
           for(int i=0;i<arr.length-1;i++){
            System.out.println(arr[i]+" ");
           }
    }
}