import java.util.*;
import java.util.Scanner;
public class inputmismatchexception{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        try{
        int age=sc.nextInt();
        }
        catch(InputMismatchException e){
            System.out.println(e);
        }
    }
}
