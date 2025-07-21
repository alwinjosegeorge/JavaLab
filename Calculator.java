/**★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
 ★ Filename    : Calculator.java
 ★ Author      : Alwin Jose George
 ★ Date        : 2025-07-21
 ★ Description : A Java program demonstrating method overloading with addition
 ★               of integers and doubles.
 ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★**/

class Calc{
	public void add (int a ,int b ) {
	int sum = a + b;
	System.out.println("The sum of Two integer:" +sum);
	}
	
	public void add (int a, int b , int c) {
	int sum =a+b+c;
	System.out.println("The sum of Three integer:" +sum);
	}
	
	public void add (double a ,double b ) {
	double sum =a+b;
	System.out.println("The sum of Two Double:" +sum);
	}
	
	
	
}
public class Calculator {
	public static void main(String[]args) {
		Calc calc =new Calc();
		calc.add(5, 5);
		calc.add(2, 20,38);
		calc.add(1.354876875637456876, 3421.74583296587451);
	}
	

}
