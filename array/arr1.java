import java.util.*;
class arr1{
	public static void main(String args[]){
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values in an array");
		for(int i = 0; i < 5; i++)		
			arr[i] = sc.nextInt();
		System.out.println("Entered values are:");
		for(int i = 0; i < 5; i++)
			System.out.print(arr[i]+", ");
	}
}