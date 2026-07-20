import java.util.Scanner;
public class duplicate{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of elements");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int arr1=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        if(n==0){
            System.out.println("array is empty");

        }
         for (int i = 0; i < n; i++) {
    boolean duplicate = false;

    for (int j = 0; j < i; j++) {
        if (arr[i] == arr[j]) {
            duplicate = true;
            break;
        }
    }

    if (!duplicate) {
        System.out.print(arr[i] + " ");
    }
}
    }
}
    
