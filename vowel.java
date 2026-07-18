import java.util.Scanner;
public class vowel{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a character");
        int c=sc.nextLine().charAt(0);
        int vowels[]={'a','e','i','o','u'};
        for(int i=0;i<vowels.length;i++){
        if(c==vowels[i]){
            System.out.println("character is a vowel");
            break;
        }else{
            System.out.println("character is not a vowel");
            break;
        }
    }
}
}