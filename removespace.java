public class removespace{
    public static void main(String[] args) {

        String str = "Java is fun";
        String result = str.replace(" ", "");

        System.out.println("Original String: " + str);
        System.out.println("After Removing Spaces: " + result);
    }
}