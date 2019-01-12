abstract class A{
	int a,b;
	abstract  void disp();
}

class B extends A{
	B(int a, int b){
		this.a = a;
		this.b = b;
	}
	public void disp()
	{
		System.out.println("Numbers are:"+a+"&"+b);
	}
}

class abs1{
	public static void main(String[] args) {
		B obj = new B(2,7);
		obj.disp();
	}
}