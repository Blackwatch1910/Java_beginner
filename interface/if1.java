interface A{
	int a = 100;	//final 
	void dispa();	//abstract
}

interface B{
	int b = 500;
	//b = b + 100;
	void dispb();
}

class C implements A,B{
	public void dispa(){
		System.out.println("Interface A:"+a);
	}
	public void dispb(){
		System.out.println("Interface B:"+b);
	}
}

class if1
{
	public static void main(String[] args) {
		C ob = new C();
		ob.dispa();
		ob.dispb();
	}
}