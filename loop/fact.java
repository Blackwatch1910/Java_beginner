import java.util.*;
class fact{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int fac = 1;
		int i = 1;
		while(i <= n){
			fac = fac * i;
			i++;
		}
		System.out.print(fac);
	}
}