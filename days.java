import java.util.Scanner;

public class days {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter years: ");
        int years = sc.nextInt();

        int days = years * 365;

        System.out.println("Days = " + days);

        sc.close();
    }
}