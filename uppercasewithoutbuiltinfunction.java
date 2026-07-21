public class uppercasewithoutbuiltinfunction{
    public static void main(String[] args){
        String str="program";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            ch=(char)(ch-32);
            System.out.print(ch);
        }
    }
}