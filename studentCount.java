/**★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
 ★ Filename    : SwitchWithString.java
 ★ Author      : Alwin Jose George
 ★ Date        : 2025-08-1
 ★ Description : Demonstrates student count and switch with string for student search.
 ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★**/
class Studentn{
	String name;
	int rollNumber;
	static int StudentCount =0;
	Studentn(String name,int rollNumber){
		this.name = name;
		this.rollNumber = rollNumber;
		StudentCount++;
	}
	public static void displaystudentcount(){
		System.out.println("Total No:of student:"+ StudentCount);
	
	}
}
public class studentCount{
	 public static void main(String[] args) {
 		 Studentn students1 = new Studentn("Alwin",101);
		 Studentn students2 = new Studentn("Anand",102);
		 Studentn students3 = new Studentn("Nikhil",103);
		 Studentn.displaystudentcount();
	 }

}
