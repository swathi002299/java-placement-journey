import java.util.*;
public class multipleexception {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30};

        try {
            // ArithmeticException
            int result = 10 / 0;
            System.out.println("Result = " + result);

            // ArrayIndexOutOfBoundsException
            System.out.println(arr[5]);
        }

        catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Cannot divide by zero.");
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: Invalid array index.");
        }

        System.out.println("Program ended.");
    }
}