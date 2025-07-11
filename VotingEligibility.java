/**★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
 ★ Filename    : VotingEligibility.java
 ★ Author      : Alwin Jose George
 ★ Date        : 2025-07-11
 ★ Description : Checks if a person is eligible to vote based on age.
 ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★**/

import java.util.Scanner;
public class VoltingEligibity {
   public static void main (String[]args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter your age: ");
	    int age=sc.nextInt();
	    if(age>18) {
	    	 System.out.println("Eligible to Vote");
	    }else {
             System.out.println("Not Eligible to Vote.");
	    }
	    sc.close();
   }
} 