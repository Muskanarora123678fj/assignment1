class Student {
    // Attributes
    private String name;
    private int age;
    private char grade;

    // Constructor
    public Student(String name, int age, char grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println();
    }
}

public class StudentDetails {
    public static void main(String[] args) {
        // Creating multiple Student objects
        Student student1 = new Student("Alice", 20, 'A');
        Student student2 = new Student("Bob", 22, 'B');
        Student student3 = new Student("Charlie", 19, 'A');

        // Displaying details of each student
        System.out.println("Student Details:");
        student1.displayDetails();
        student2.displayDetails();
        student3.displayDetails();
    }
}
