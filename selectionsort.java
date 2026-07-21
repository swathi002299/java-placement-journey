public class selectionsort{
    public static void main(String[] args){
        int arr[]={2,5,3,6};
        int temp;
        for(int i=0;i<arr.length;i++){
            int min=i;
            for(int j=i+1;j<arr.length-1;j++){

                if(arr[j]<min){
                    min=j;
                }
            }
                    temp=arr[i];
                    arr[i]=arr[min];
                    arr[min]=temp;

                
            
        }
        for(int i=0;i<arr.length;i++){
            System.out.println("array after selection sort"+arr[i]+" ");
        }
    }
}