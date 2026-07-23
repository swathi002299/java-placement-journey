import java.util.Scanner;
public class linkedlistinsertatbeginning{
    public static void main(String[] args){
        int arr[]=new int[5];
        arr[0]=20;
        arr[1]=30;
        arr[2]=40;
        arr[3]=50;
        int size=4;
        int element=10;
        for(int i=size;i>0;i--){
           arr[i]=arr[i-1];
        } 
        arr[0]=element;
        size++;
        for(int i=0;i<size;i++){
            System.out.println(arr[i]+" ");
        }
    }
}