import java.util.Scanner;
public class rotateleftbykposition{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of elements");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter element");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the k element");
        int k=sc.nextInt();
        k=k%n;
        int temp[]=new int[n];
        for(int i=0;i<n;i++){
            temp[i]=arr[(i+k)%n];
        }
        System.out.print("the array after rotating in left by k positions");
        for(int i=0;i<n;i++){
        System.out.print(temp[i]+" ");
        }
    }
}