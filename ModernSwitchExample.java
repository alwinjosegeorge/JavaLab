/**★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
 ★ Filename    : ModernSwitchExample.java
 ★ Author      : Alwin Jose George
 ★ Date        : 2025-07-11
 ★ Description : Demonstrates modern switch expression using Java 14+ features.
 ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★**/

public class ModernSwitchExample {
   public static void main(String[] args) {
    String grade = "A";

    String result = switch (grade) {
    	case "O" -> "Outstanding Performance";
    	case "A+" -> "Excellent Performance";
    	case "A" -> "Very Good Performance";
    	case "B+" -> "Good Performance";
    	case "B" -> "Above Average Performance";
    	case "C" -> "Average Performance";
    	case "P" -> "Pass";
    	case "F" -> "Fail";
    	default -> "Invalid Grade";
    	};

    System.out.println("Grade: " + grade);
    System.out.println("Result: " + result);
   }
}