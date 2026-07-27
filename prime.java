import java.util.Scanner;
public class prime{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a value for n");
        int n=sc.nextInt();
        for(int i=2;i<n;i++){
        boolean prime=true;
        for(int j=2;j<i;j++){
            if(i%j==0){
                prime=false;

            }
        }
    
    if(prime){
        System.out.println(i+" ");
    }
}
}
}