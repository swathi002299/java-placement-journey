import java.util.Scanner;
public class add{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter value of a ");
    int a=sc.nextInt();
    System.out.println("enter value of b");
    int b=sc.nextInt();
    int sub=a*b;
    System.out.println("sub of a and b is "+sub);
}
}