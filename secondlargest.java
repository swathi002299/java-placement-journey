import java.util.Scanner;
public class secondlargest{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of elements ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter elements ");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        int secondmax=arr[1];
        for (int i=0;i<n;i++){
        if(arr[i]>max){
            secondmax=max;
            max=arr[i];
        }
        if(arr[i]<max&&arr[i]>secondmax){
            secondmax=arr[i];
        }
        }
        System.out.println("secondlargest element is "+secondmax);
        }

    }
