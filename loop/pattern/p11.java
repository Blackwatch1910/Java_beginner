class p11{
	public static void main(String args[]){
		int k = 4;
		for (int i = 1; i <= 5; i++)
		{
			for(int j = 1; j <= k; j++)
				System.out.print(" ");
			k--;
			for(int j = 1; j <= 2*i-1; j++)
				System.out.print('*');
		System.out.println();
		}
	}
}