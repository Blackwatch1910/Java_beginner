class class5{
	int roll;
	String name;
	float per;

	class5(int roll, String name, float per){
		this.roll = roll;
		this.name = name;
		this.per = per;					//left side global variables
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

class kw{
	public static void main(String args[]){
		class4 obj = new class4(13,"Devanshu",95.75f);
		obj.display();
	}
}