/**★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
 ★ Filename    : NamedBook.java
 ★ Author      : Alwin Jose George
 ★ Date        : 2025-07-18
 ★ Description : Parameterized Constructor in Java for input Student name,roll no,dept
 ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★**/
import java.util.Scanner;
class Student{
	String name;
	int rollNumber;
	String department;
	Student(String Studentname,int roll, String Studentdepartment){
		this.name=Studentname;
		this.rollNumber=roll;
		this.department=Studentdepartment ;
	}
		void displayStudent() {
	        System.out.println("Name: " + name);
	        System.out.println("Roll Number: " + rollNumber);
	        System.out.println("Department: " + department);
	}
}
public class ParameterizedConstructor {
	 public static void main (String[]args) {
		    Scanner sc = new Scanner(System.in);
		    System.out.print("Enter your Name: ");
	        String name = sc.nextLine();
	        System.out.print("Enter your RollNumber: ");
	        int rollNumber= sc.nextInt();
	        System.out.print("Enter your department: ");
	        String department =sc.next();
	        Student student = new Student(name, rollNumber, department);
	        System.out.println("\nStudent Details:");
	        student.displayStudent();
}
}
