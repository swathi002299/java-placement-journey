class studentmanagement {

    String name;
    int rollNo;
    int marks;

    // Method to display student details
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Marks: " + marks);
    }

    // Method to calculate grade
    void calculateGrade() {

        if (marks >= 90) {
            System.out.println("Grade: A");
        }
        else if (marks >= 80) {
            System.out.println("Grade: B");
        }
        else if (marks >= 70) {
            System.out.println("Grade: C");
        }
        else if (marks >= 60) {
            System.out.println("Grade: D");
        }
        else {
            System.out.println("Grade: F");
        }
    }

    public static void main(String[] args) {

        studentmanagement s1 = new studentmanagement();

        s1.name = "Swathi";
        s1.rollNo = 101;
        s1.marks = 88;

        s1.displayDetails();
        s1.calculateGrade();
    }
}