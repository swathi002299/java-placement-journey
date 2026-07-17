import java.util.Scanner;
public class printarrayinreverse{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of elements");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("eneter elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("array in reverse order");
        for (int i=n-1;i>=0;i--){
            System.out.print(arr[i] + " ");
        }
    }
}