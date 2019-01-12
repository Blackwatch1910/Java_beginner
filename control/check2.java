import java.util.*;
class check2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers for comparison");
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a > b)
			System.out.println(a+" is greater");
		else if(a < b)
			System.out.println(b+" is greater");
		else 
			System.out.println("Numbers are equal");
	}
}
