import java.util.Scanner;
class fib{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of terms to be printed");
		int n = sc.nextInt();
		int a = -1;
		int i = 0;
		int b = 1;
		int c;
		while(i <= n){
			c = a+b;
			System.out.print(c+",");
			a = b;
			b = c;
			i++;
		}
	}
}