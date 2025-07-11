/**★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
 ★ Filename    : Ifelseifcondition.java
 ★ Author      : Alwin Jose George
 ★ Date        : 2025-07-11
 ★ Description : Assigns a grade based on marks using if-else if conditions.
 ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★**/
import java.util.Scanner;

public class Ifelseifcondition {
	public static void main (String[]args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter your Marks: ");
	    int mark=sc.nextInt();
	    if(mark>=90) {
	    	 System.out.println("Grade A");
	    }
	    else if(mark>=80){
             System.out.println("Grade B");
	    }else if(mark>=70) {
	    	 System.out.println("Grade C");
	    }else {
	    	 System.out.println("Grade D");
	    }
	    sc.close();
	}
}
