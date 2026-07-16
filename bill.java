import java.util.Scanner;
public class bill{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of items");
        int n=sc.nextInt();
        String[] itemname=new String[n];
        double[] price=new double[n];
        int total=0;
        for(int i=0;i<n;i++){
            System.out.println("enter item name ");
             itemname[i]=sc.next();
         System.out.println("enter price");
          price[i]=sc.nextDouble();
           total+=price[i];
        }
        double gst=total*0.18;
        double finalamount=total+gst;
        System.out.println("------------Restaurant Bill--------------------------------");
        System.out.println("itemname \t price");
        System.out.println("--------------------------------------------");
        for (int i=0;i<n;i++){
            System.out.println(itemname[i]+"\t\t\t "+price[i]);   
        }
        
        System.out.println("--------------------------------------------");
        System.out.println("total=\t\t\t"+total);
        System.out.println("gst=\t\t\t"+gst);
        System.out.println("finalamount=\t\t"+finalamount );
        }
    }
