import java.util.*;
class arr2{
	public static void main(String args[]){
		int arr[] = new int[5];
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values in an array");
		for(int i = 0; i < 5; i++)		
			arr[i] = sc.nextInt();
		for(int i = 0; i < 5; i++){
			if(arr[i]%2 == 0)
				count++;
		}
		System.out.println("Number of even values: "+count);
		System.out.println("Number of odd values: "+(5-count));
	}
}
			