class Student {
    String name;
    int rollNumber;
    char grade;

    // Constructor to initialize all fields
    public Student(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
    }
}

public class Main {
    public static void main(String[] args) {
        // TODO: Create Student object using constructor
        Student student = new Student("Alice Johnson", 101, 'A');

        // TODO: Call displayDetails()
        student.displayDetails();
    }
}
