import java.util.Scanner;
class switch3{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(" + for addition\n - for subtraction\n * for multiplication \n / for division"); 
		System.out.println("Enter arithmetic operator");
		char ch = sc.next().charAt(0);
		switch(ch){
			case '+':
				System.out.println("Addition="+(a+b));
				break;
			case '-':
				System.out.println("Subtraction="+(a-b));
				break;
			case '*':
				System.out.println("Multiplication="+(a*b));
				break;
			case '/':
				System.out.println("Division="+((float)a/(float)b));
				break;	
			case '%':
				System.out.println("Remainder="+(a%b));
				break;	
			default:
				System.out.println("Hard luck");
		}
	}
}	