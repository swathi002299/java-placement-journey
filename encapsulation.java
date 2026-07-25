class Student {

    // Private data members
    private String name;
    private int marks;

    // Setter methods
    public void setName(String n) {
        name = n;
    }

    public void setMarks(int m) {
        marks = m;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }
}

public class encapsulation{

    public static void main(String[] args) {

        Student s = new Student();

        s.setName("Swathi");
        s.setMarks(95);

        System.out.println("Name: " + s.getName());
        System.out.println("Marks: " + s.getMarks());
    }
}