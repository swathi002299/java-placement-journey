public class temp{
    void fahrenheit(double c){
        double f=(c*9.0/5.0)+32;
        System.out.println("fahrenheit is "+f);
    }
    void celsius(double f){
        double c=(f-32)*(5.0/9.0);
        System.out.println("celsius is "+c);
    }
    public static void main(String[] args){
    temp t=new temp();
    t.fahrenheit(30);
    t.celsius(35);
    t.fahrenheit(98);
}
}