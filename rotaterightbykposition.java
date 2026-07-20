import java.util.Scanner;

public class rotaterightbykposition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the value of K: ");
        int k = sc.nextInt();

        k = k % n;   // Handles cases where k > n

        int[] temp = new int[n];

        // Right rotation
        for (int i = 0; i < n; i++) {
            temp[(i + k) % n] = arr[i];
        }

        System.out.println("Array after right rotation:");
        for (int i = 0; i < n; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}