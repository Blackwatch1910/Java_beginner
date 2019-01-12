import java.util.*;
class palind{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check palindrome");
		int n = sc.nextInt();
		int m = n;
		int sum = 0;
		int d;
		while(n != 0){
			d = n%10;
			sum = (sum * 10) + d;
			n = n/10;
		}
		if(sum == m)
			System.out.println(m+" is palindrome");
		else
			System.out.println(m+" is not palindrome");
	}
}
			

		