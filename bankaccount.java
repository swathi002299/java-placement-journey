public class bankaccount{
    int balance;
     void deposite(int amount){
         int totalamount=balance+amount;
        System.out.println("the balance amount is "+totalamount );
    }
    void withdraw(int amount){
        int balanceamount=balance-amount;
        System.out.println("the balance is"+balanceamount);
    }
    public static void main(String[] args){
        bankaccount b=new bankaccount();
        b.balance=5000;
        b.deposite(1000);
        b.withdraw(2000);
           
    }
}