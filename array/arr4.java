import java.util.*;
class arr4{
	public static void main(String args[]){
		int arr[][] = new int[3][3];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values in an array");
		for(int i = 0; i < 3; i++){
			for (int j = 0; j < 3 ; j++ ) {
				arr[i][j] = sc.nextInt();
			}
		}

		System.out.println("Entered values are");
		for(int i = 0; i < 3; i++){
			for (int j = 0; j < 3 ; j++ ) {
				if(i == j)
					System.out.print(arr[i][j]+"\t");
				else
					System.out.print("\t");
			}
			System.out.println();
		}
	}
}