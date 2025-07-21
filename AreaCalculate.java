
/**★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
★ Filename    : Calculator.java
★ Author      : Alwin Jose George
★ Date        : 2025-07-21
★ Description : A Java program with overloading method with area
★               of integers and doubles.
★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★**/
package skrr;
class Area{
	public void calc(float radius ) {
	float area = radius*radius ;
	System.out.println("The area of Circle :" +area);
	}
	
	public void calc(double l ,double b ){
	double area = l*b;
	System.out.println("The area of rectangle:" +area);
	}
	public void calc(float b ,float h ){
	double area =1/2*b*h;
	System.out.println("The area of triangle:" +area);
	}
	public void calc(int radius ) {
	int area = radius*radius ;
	System.out.println("The area of square :" +area);
	}
}
public class AreaCalculate {
	public static void main(String[]args) {
		Area area =new Area();
		area.calc(5, 5);
		area.calc(2);
		area.calc(3f);
		area.calc(1.3548768f, 3421.74583296587451f);
    }
}
