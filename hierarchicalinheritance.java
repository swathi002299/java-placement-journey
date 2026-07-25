// Parent class
class Person {

    void display() {
        System.out.println("I am a Person");
    }
}

// Child class 1
class Student extends Person {

    void study() {
        System.out.println("Student is studying");
    }
}

// Child class 2
class Teacher extends Person {

    void teach() {
        System.out.println("Teacher is teaching");
    }
}

public class hierarchicalinheritance {

    public static void main(String[] args) {

        Student s = new Student();
        Teacher t = new Teacher();

        s.display();   // Inherited from Person
        s.study();

        t.display();   // Inherited from Person
        t.teach();
    }
}