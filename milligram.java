import java.util.Scanner;

public class milligram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter kilograms: ");
        double kg = sc.nextDouble();

        double mg = kg * 1000000;

        System.out.println("Milligrams = " + mg);

        sc.close();
    }
}