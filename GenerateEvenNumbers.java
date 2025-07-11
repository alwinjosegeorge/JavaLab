/**★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
 ★ Filename    : GenerateEvenNumbers.java
 ★ Author      : Alwin Jose George
 ★ Date        : 2025-07-11
 ★ Description : A Java program to generate even numbers up to a given limit.
 ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★**/
import java.util.Scanner;

	public class GenerateEvenNumbers {
		public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit : ");
		int limit=sc.nextInt();
		System.out.println("Even numbers upto "+limit);
		for( int i=0; i<=limit;i+=2) {

				System.out.println(i);
		}
		}
}