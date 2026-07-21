public class bubblesort{
    public static void main(String[] args){
        int arr[]={2,5,3,6};
        int temp;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println("array after bubble sort"+arr[i]+" ");
        }
    }
}