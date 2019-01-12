class class2
{
		int roll;
		String name;
	
		class2()
		{
			System.out.println("Values instantiating...");
		}		
	}

	class consta
	{
		public static void main(String args[])
		{
			class2 obj=new class2();
			System.out.println("Roll no:"+obj.roll);
			System.out.println("Name:"+obj.name);
		}
	}