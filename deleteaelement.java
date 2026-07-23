public class deleteaelement{
    public static void main(String[] args){
        int arr[]=new int[5];
         arr[0]=10;
         arr[1]=20;
         arr[2]=30;
         arr[3]=40;
         arr[4]=50;
         int size=5;
         int element=30;
         int index=-1;
         for(int i=0;i<size;i++){
            if(arr[i]==element){
                index=i;
                break;
            }

         }
         if(index!=-1){
            for(int i=index;i<size-1;i++){
                arr[i]=arr[i+1];
            }
                size--;
            
         

         for(int i=0;i<size;i++){
            System.out.println(arr[i]+" ");
         }
         }
    }
}