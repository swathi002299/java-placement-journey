
public class divisionbyzero{
    public static void main(String[] args)throws Exception{
        int a=10;
        int b=0;
        try{
            int result=a/b;
            System.out.println("result is "+result);
        }catch(ArithmeticException e){
            System.out.println(e);
        }
        }
    }
