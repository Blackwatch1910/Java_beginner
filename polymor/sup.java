class A{
	int roll;
	String name;
	A(int roll, String name){
		this.roll = roll;
		this.name = name;
		System.out.println("Values initialising...");
	}
	void display(){
		System.out.println("Parent class method");
	}
}

class B extends A{
	int roll;
	String name;
	B(int r1, int r2, String n1, String n2){
		super(r1,n1);
		super.roll = r1;
		roll = r2;
		super.name = n1;
		name = n2;
	}
	void display(){
		System.out.println("First student name is:"+super.name);
		System.out.println("First student roll no. is:"+super.roll);
		System.out.println("Second student name is:"+name);
		System.out.println("Second student roll no. is:"+roll);
	}
	void disp(){
		display();
		super.display();
		System.out.println("Normal flow");
	}
}

class sup{
	public static void main(String args[]){
		B obj = new B(101,102,"Devanshu","Stark");
		obj.display();
		obj.disp();
	}
}