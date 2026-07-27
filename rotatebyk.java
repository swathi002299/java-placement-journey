import java.util.Scanner;

public class rotatebyk {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter K: ");
        int k = sc.nextInt();

        k = k % arr.length;

        for (int j = 0; j < k; j++) {
            int first = arr[0];

            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }

            arr[arr.length - 1] = first;
        }

        System.out.print("Array after rotation: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}