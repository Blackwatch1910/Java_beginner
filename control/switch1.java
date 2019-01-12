import java.util.*;
class switch1{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice");
		int choice = sc.nextInt();
		switch(choice){
			case 1:
				System.out.println("First");
				break;
			case 2:
				System.out.println("Second");
				break;
			case 3:
				System.out.println("Third");
				break;
			default:
				System.out.println("Try again");
		}
	}
} 