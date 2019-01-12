import java.util.Scanner;
class day1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a;
		char ch;
		String s;
		System.out.println("Enter any number");
		a = sc.nextInt();
		System.out.println("Number is:"+a);
		System.out.println("Enter a character");
		ch = sc.next().charAt(0);
		System.out.println("Character is:"+ch);
		System.out.println("Enter a string");
		s = sc.next();
		System.out.println("String is:"+s);
	}
}