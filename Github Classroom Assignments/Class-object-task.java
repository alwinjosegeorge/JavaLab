// TODO: Create a class called Student with name, rollNumber, and grade
class Student {
    String name;
    int rollNumber;
    char grade;

    Student(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
    }

    
 public   void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
    }
}

    // TODO: Create a method to display student details
public class Main {
      public static void main(String[] args) {
           
        Student student = new Student("John", 101, 'A');
        student.displayDetails();
        // TODO: Create a Student object and call the method to display details
    }
}
