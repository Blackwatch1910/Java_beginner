class e1{
	public static void main(String[] args) {
		int a = 10, b = 10, c, d;
		try{
			c = a/(a-b);
			System.out.println("Value of C:"+c);
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		d = a/(a+b);
		System.out.println("Value of D:"+d);
	}
}