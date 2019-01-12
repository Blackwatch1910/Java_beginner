import java.util.*;
class check4{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers for comparison");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a > b){
			if(a > c)
				System.out.println(a+" is biggest");
			else	
				System.out.println(b+" is biggest");
		}
		else{
			if(b>c)
				System.out.println(b+" is biggest");
			else 
				System.out.println(c+" is biggest");
		}
	}
}
				