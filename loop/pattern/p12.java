class p12{
	public static void main(String args[]){
		int count = 1;
		//int k = 4;
		for (int i = 1; i <= 5; i++)
		{
			for(int j = 1; j <= 5-i; j++)
				System.out.print(" ");
			count = i;
			for(int j = 1; j <= i; j++){
				System.out.print(count);
				count++;
				}
			count = count - 2;
			for(int j = 1; j <= i-1; j++)
				System.out.print(count--);
		System.out.println();
		}
	}
}
