import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hours: ");
        int hours = sc.nextInt();

        int seconds = hours * 3600;

        System.out.println("Seconds = " + seconds);

        sc.close();
    }
}