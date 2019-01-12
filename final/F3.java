final class F3{
	String name = "Stark";
	int roll = 100;
}

class rex extends F3{
	public static void main(String[] args) {
		F3 obj = new F3();
		System.out.println(obj.name+" "+obj.roll);	
	}
}