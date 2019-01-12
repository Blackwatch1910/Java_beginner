import java.util.*;
class sump{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int d;
		int pro = 1;
		while(n != 0){
			d = n%10;
			pro = pro*d;
			n = n/10;
		}
		System.out.println("Product of digits="+pro);
	}
}