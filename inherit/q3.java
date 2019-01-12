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

class B extends A{
	void mult(int x, int y){
		a = x;
		b = y;
		System.out.println("Multiplication:"+(a * b));
	}
	public static void main(String args[]){
		B obj = new B();
		C obj1 = new C();
		D obj2 = new D();
		obj.add(10,5);
		obj1.sub(100,25);
		obj2.divide(23,3);
		obj.mult(2,6);
	}
}

class D extends A{
	void divide(int x, int y){
		a = x;
		b = y;
		System.out.println("Division:"+((float)a/(float)b));
	}
}