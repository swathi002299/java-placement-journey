public class evenoroddarray{
    public static void main(String[] args){
        int arr[]={22,33,44,55,66,77,88,99,11};
        int odd=0;
        int even=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
            
    }
    System.out.println("the count of even number"+even);
    System.out.println("the count of odd number"+odd);
}
}