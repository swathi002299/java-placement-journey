public class perimeter{
    void perimeter(int l,int b){
        int perimeter=2*(l+b);
        System.out.println("perimeter of rectangle is "+perimeter);
    }
    void perimeter(int a){
        int perimeter =4*a;
        System.out.println("perimeter of square is"+perimeter);
    }
       
    public static void main(String[] args){
        perimeter a=new perimeter();
        a.perimeter(5,3);
        a.perimeter(2);
        a.perimeter(7,6);
        a.perimeter(4);
        

    }
}
