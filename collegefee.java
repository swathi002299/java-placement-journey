import java.util.Scanner;

public class collegefee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Tuition Fee:");
        double tuitionFee = sc.nextDouble();

        System.out.println("Enter Bus Fee:");
        double busFee = sc.nextDouble();

        System.out.println("Enter Hostel Fee:");
        double hostelFee = sc.nextDouble();

        System.out.println("Enter Exam Fee:");
        double examFee = sc.nextDouble();

        System.out.println("Enter Library Fee:");
        double libraryFee = sc.nextDouble();

        double totalFee = tuitionFee + busFee + hostelFee + examFee + libraryFee;

        double gst = totalFee * 0.18;

        double finalAmount = totalFee + gst;

        System.out.println("\n----------- Fee Details -----------");
        System.out.println("Tuition Fee : " + tuitionFee);
        System.out.println("Bus Fee     : " + busFee);
        System.out.println("Hostel Fee  : " + hostelFee);
        System.out.println("Exam Fee    : " + examFee);
        System.out.println("Library Fee : " + libraryFee);
        System.out.println("-----------------------------------");
        System.out.println("Total Fee   : " + totalFee);
        System.out.println("GST (18%)   : " + gst);
        System.out.println("Final Amount: " + finalAmount);

        sc.close();
    }
}