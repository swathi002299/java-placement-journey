import java.util.Scanner;

public class exist{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to check: ");
        int key = sc.nextInt();

        boolean found = false;

        // Check if element exists
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Element exists in the array.");
        } else {
            System.out.println("Element does not exist in the array.");
        }

        sc.close();
    }
}