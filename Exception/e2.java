class e2{
	public static void main(String[] args) {
		int a[] = new int [5];
		try{
			a[5] = 10;
			System.out.println("Value of A[5]"+a);
		}
		catch(ArrayIndexOutOfBoundsException e2){
			System.out.println(e2);
		}
		catch(ArithmeticException e1){
			System.out.println(e1);
		}
	}
}