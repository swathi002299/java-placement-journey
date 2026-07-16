import java.util.Scanner;
public class electricitybill{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter name of house owner");
        String name=sc.nextLine();
        System.out.println("enter address of house");
        String address=sc.nextLine();
        System.out.println("enter previous reading");
        int prev=sc.nextInt();
        System.out.println("enter current reading");
        int curr=sc.nextInt();
        int units=curr-prev;
        double bill=units*5.0;
        System.out.println("------------Electricity Bill--------------------------------");
        System.out.println("name of house owner=\t\t"+name);
        System.out.println("address of house=\t\t"+address);
        System.out.println("previous reading=\t\t"+prev);
        System.out.println("current reading=\t\t"+curr);
        System.out.println("units consumed=\t\t\t"+units);
        System.out.println("total bill=\t\t\t"+bill);

    }
}