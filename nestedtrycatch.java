public class nestedtrycatch {
    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;

            try {
                if (b == 0) {
                    throw new ArithmeticException("Cannot divide by zero");
                }

                int result = a / b;
                System.out.println("Result: " + result);

            } catch (ArithmeticException e) {
                System.out.println("Arithmetic Error: " + e.getMessage());
            }

            try {
                int[] numbers = {10, 20, 30};

                System.out.println(numbers[5]);

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array Error: Invalid array index");
            }

        } catch (Exception e) {
            System.out.println("Some other error occurred");
        }
    }
}