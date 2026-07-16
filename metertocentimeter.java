import java.util.Scanner;

public class metertocentimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter meters: ");
        double meter = sc.nextDouble();

        double centimeter = meter * 100;

        System.out.println("Centimeters = " + centimeter);

        sc.close();
    }
}