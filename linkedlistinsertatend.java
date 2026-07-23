import java.util.Scanner;
public class linkedlistinsertatend{
    public static void main(String[] args){
        int arr[]=new int[5];
        arr[0]=20;
        arr[1]=30;
        arr[2]=40;
        arr[3]=50;
        int size=4;
        int element=10;
        arr[size]=element;
        size++;
        for(int i=0;i<size;i++){
            System.out.println(arr[i]+" ");
        }
    }
}