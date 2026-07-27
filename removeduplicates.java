public class removeduplicates{
    public static void main(String[] args){
        int arr[]={1,1,2,3,3,4,5,6};
        int n=8;
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=arr[j]){
                j++;
                arr[j]=arr[i];

            }
        }
        System.out.println("array after removing duplicates");
        for(int i=0;i<=j;i++){
            System.out.print(arr[i]+" ");
        }
    }
}