import java.util.*;
class arm{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int m = n;
		int d;
		int sum = 0;
		while(n != 0){
			d = n%10;
			sum = sum+(d*d*d);
			n = n/10;
		}
		if(m == sum)
			System.out.println(m+" is armstrong");
		else
			System.out.println(m+" is not armstrong"); 
	}
}