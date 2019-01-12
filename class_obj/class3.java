class class3{
	int l;
	int b;

	class3(int x,int y){
		l = x;
		b = y;
	}

	void area(){
		int area = l * b;
		System.out.println("Area:"+area);
	}
}

class rect{
	public static void main(String args[]){
		class3 obj = new class3(10,20);
		obj.area();
	}
}