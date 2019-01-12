class e3{
	public static void main(String[] args) {
		int a = 10;
		int arr[] = new int [3];
		try{
			a = 10;
			try{
				arr[3] = 23;
				System.out.println("Last element value:"+arr[3]);
			}
			catch(ArrayIndexOutOfBoundsException e1){
				System.out.println(e1);
			}
			try{
				arr[2] = 4/0;
				System.out.println("Last second element"+arr[2]);
			}
			catch(ArithmeticException e2){
				System.out.println(e2);
			}
		}
		catch(ArithmeticException e3){
			System.out.println(e3);
		}
	}
}