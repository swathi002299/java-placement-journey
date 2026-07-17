import java.util.Scanner;
public class sortedornot{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of elements");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Boolean sorted=true;
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                System.out.println("array is not sorted");
                sorted=false;
                break;
            }
        }
        if(sorted){
            System.out.println("array is sorted");
        }else{
            System.out.println("array is not sorted");
        }
        }
    }
