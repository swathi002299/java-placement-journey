import java.util.Scanner;
public class zerosatend{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no if elements");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int temp[]=new int[n];
        System.out.println("enter elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int j=0;
        for(int i=0;i<n;i++){
            
            if(arr[i]!=0){
                temp[j]=arr[i];
                j++;
                continue;
            


        }
        }
        System.out.println("array after removing zero");
        for(int i=0;i<n;i++){
            System.out.println(temp[i]+" ");
        }
    }
}
