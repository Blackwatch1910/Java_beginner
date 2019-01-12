import java.util.*;
	int roll;
	String name;
class class1{

	public int add(int x,int y){
		return (x+y);
	}
}

class basic{
	public static void main(String args[]){
		class1 obj = new class1();
		//variables
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the roll number");
		obj.roll = sc.nextInt();
		System.out.println("Enter the name");	//instantiate = basic value assigned for a specific task
		obj.name = sc.next();	//default constructor called as soon as obj is created
		System.out.println("Roll number and name is: "+obj.roll +obj.name);
		//method declaration
		System.out.println("Enter two numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Addition: "+(obj.add(a,b)));
	}
}