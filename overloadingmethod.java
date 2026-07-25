public class overloadingmethod{
    void sum(int a,int b){
        int sum=a+b;
        System.out.println("sum="+sum);
    }
    void sum(int a,int b,int c){
        int sum=a+b+c;
        System.out.println("sum="+sum);
    }
    void sum(double a,double b){
        double sum=a+b;
        System.out.println("sum="+sum);
    }
    public static void main(String[] args){
        overloadingmethod o=new overloadingmethod();
        o.sum(5,6);
        o.sum(5,6,7);
        o.sum(7.0,5.6);
    }
}