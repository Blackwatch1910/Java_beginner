import java.util.*;
class day2_1{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("Enter the values of a and b");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("Addition:"+(a+b));
		System.out.println("Subtraction:"+(a-b));
		System.out.println("Multiplication:"+(a*b));
		System.out.println("Division quotient:"+(a/b));
		System.out.println("Division remainder:"+(a%b));
		int c = a+b;
		System.out.println("Value of c:"+c);
		System.out.println("****INCREMENT OPERATOR****");
		System.out.println("a="+a);
		System.out.println("++a="+(++a));
		System.out.println("a++="+(a++));
		System.out.println("a="+a);
		System.out.println("--a="+(--a));
		System.out.println("a--="+(a--));
		System.out.println("a="+a);
		System.out.println("****RELATIONAL OPERATOR****");
		boolean check;
		check = a>b;
		System.out.println("check if a is greater than b:"+check);
		System.out.println("****Ternary Operator****");
		c = (a<b)?9:0;
		System.out.println("check for c "+c);
		System.out.println("****Logical Operation****");
		System.out.println("AND operation-");
		System.out.println(a & b);
		System.out.println("OR operation-");
		System.out.println(a | b);
	}
}