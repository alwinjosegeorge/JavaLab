
/**★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
 ★ Filename    : PalindromeNumber.java
 ★ Author      : Alwin Jose George
 ★ Date        : 2025-07-11
 ★ Description : Checks whether a given number is a palindrome.
 ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★**/
import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.print("Enter a number");
	    int number = sc.nextInt();
	    int origin=number;
	    int reverse=0,reminder;
	    while(number>0)  {
	    	reminder = number%10;
	    	reverse=reverse *10 + reminder;
	    	number=number/10;
	    	
	    }
	    if(origin ==reverse) {
	    	System.out.println("The number is palindrome");
	    }else {
	    	System.out.println("The number is not palindrome");
	    }
	    
	}

}
