class A{
	String name;
	int roll;
	float per;
	void display(int roll, String name, float per){
		this.roll = roll;
		this.name = name;
		this.per = per;
		System.out.println("Name:"+(this.name));
		System.out.println("Roll no.:"+(this.roll));
		System.out.println("Percentage:"+(this.per));
	}
}

class B extends A{
	void display(int roll, String name, float per){
		this.roll = roll;
		this.name = name;
		this.per = per;
		System.out.println("Name:"+(this.name));
		System.out.println("Roll no.:"+(this.roll));
		System.out.println("Percentage:"+(this.per));
	}
	public static void main(String args[]){
		B obj = new B();
		obj.display(13,"Devanshu",96.75f);	//class B gets preferred over A

		A obj1 = new A();
		obj1.display(11,"Devansh",99.75f);	// for class A we have to create a new object
	}
}