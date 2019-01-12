class Student{
	int m1, m2;
	void getdata(int m1, int m2){
		this.m1 = m1;
		this.m2 = m2;
	}

	void putdata(){
		System.out.println("Marks1:"+m1);
		System.out.println("Marks2:"+m2);
	}
}

interface sport{
	int sp = 91;
	void spmarks();
}

class Detail extends Student implements sport{
	public void spmarks(){
		System.out.println("Sport marks:"+sp);
	}
	void disp()
	{
		int total = m1 + m2 + sp;
		putdata();
		spmarks();
		System.out.println("Total:"+total);
	}
}

class if2{
	public static void main(String[] args) {
		Detail obj = new Detail();
		obj.getdata(87,84);
		obj.disp();
	}
}