import java.util.*;
class check3{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check if its even/odd");
		int num = sc.nextInt();
		if(num%2 == 0)
			System.out.println(num+" is even");
		else
			System.out.println(num+" is odd");
	}
}	