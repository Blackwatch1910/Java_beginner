class class6{
	int roll;
	String name;
	float per;

	class6(int roll, String name, float per){
		this();		
		this.roll = roll;
		this.name = name;
		this.per = per;	
				//left side global variables
	}

	class6(){
		System.out.println("Default constructor");
	}
	void disp(){
		System.out.println("Normal method");
	}
	void display()
	{
		System.out.println("Roll number:"+this.roll);
		System.out.println("Name:"+this.name);
		System.out.println("Percentage:"+this.per);
		this.disp();
	}
}

class wed{
	public static void main(String args[]){
		class6 obj = new class6(13,"Devanshu",95.75f);
		obj.display();
	}
}