class poly{
	//Number
	void disp(int x){
		System.out.println("Single argument:"+x);
	}
	void disp(int x, int y){
		System.out.println("Two arguments:"+x+" "+y);
	}

	//Type
	void disp(int x,float y){
		System.out.println("One integer and other float:"+x+" "+y);
	}
	void disp(int x, char c){
		System.out.println("One integer and other character:"+x+" "+c);
	}

	//Sequence
	void disp(float x, char c){
		System.out.println("one float and other character:"+x+" "+c);
	}
	void disp(char c, float y){
		System.out.println("one character and other float:"+c+" "+y);
	}

	public static void main(String args[]){
		poly pm = new poly();
		pm.disp(5);
		pm.disp(10,2);
		pm.disp(1,2.2f);
		pm.disp(2,'*');
		pm.disp(4.32f,'#');
		pm.disp('$',5.20f);
	}

}