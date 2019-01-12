class A{
	int a,b;

	void add(int x, int y){
		a = x;
		b = y;
		System.out.println("Addition:"+(a+b));
	}
}

class C extends A{
	void sub(int x, int y){
		a = x;
		b = y;
		System.out.println("Subtraction:"+(a-b));
	}
}

class B extends C{
	void mult(int x, int y){
		a = x;
		b = y;
		System.out.println("Multiplication:"+(a * b));
	}
	public static void main(String args[]){
		B obj = new B();
		obj.add(10,5);
		obj.sub(100,25);
		obj.mult(2,6);
	}
}