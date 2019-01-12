class F2{
	String name;
	int x;
	public final void Display(String name){
		System.out.println(name);
	}
	public final void Display(int x){
		System.out.println(x);
	}
}

class Finale extends F2{
	String name;
	int x;
	public final void Display(String name){
		System.out.println(this.name);
	}
	public final void Display(int x){
		System.out.println(this.x);
	}
	Finale obj = new Finale();
	System.out.println("Name1:"+(super.name));
	System.out.println("Number1:"+(super.x));
	System.out.println("Name2:"+(obj.name));
	System.out.println("Number2:"+(obj.x));
}