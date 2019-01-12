import java.util.*;
class prime{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check for prime");
		int n = sc.nextInt();
		int c = 0;
		for(int i = 2; i <= n/2; i++){
			if(n % i == 0){
				c = 1;
				break;
			}
			else 
				continue;
		}
		if(c == 0)
			System.out.println(n+" is prime");
		else
			System.out.println(n+" is composite");
	}
}
