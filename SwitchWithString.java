/**★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
 ★ Filename    : SwitchWithString.java
 ★ Author      : Alwin Jose George
 ★ Date        : 2025-07-11
 ★ Description : Prints performance feedback based on student's grade.
 ★ Tags        : [Java], [Switch Statement], [Grade Evaluation]
 ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★**/
public class SwitchWithString {
    public static void main(String[] args) {
        String grade = "A+";
        
        switch (grade) {
            case "O":
                System.out.println("Outstanding Performance");
                break;
            case "A+":
                System.out.println("Excellent Performance");
                break;
            case "A":
                System.out.println("Very Good Performance");
                break;
            case "B+":
                System.out.println("Good Performance");
                break;
            case "B":
                System.out.println("Above Average Performance");
                break;
            case "C":
                System.out.println("Average Performance");
                break;
            case "P":
                System.out.println("Pass");
                break;
            case "F":
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid Grade");
        }
    }
}

