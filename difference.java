import java.util.Scanner;
public class difference{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of elements");
        int n=sc.nextInt();
        System.out.println ("enter elements");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];

            }
            }
            int difference=max-min;
            System.out.println("max value is "+max);
            System.out.println("min value is "+min);
            System.out.println("difference between max and min is "+difference);
        }

    }
