import java.util.*;
class arr_add{
	public static void main(String args[]){
		int a[][] = new int[3][3];
		int b[][] = new int[3][3];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values in first array");
		for(int i = 0; i < 3; i++){
			for (int j = 0; j < 3 ; j++ ) {
				a[i][j] = sc.nextInt();
			}
		}

		System.out.println("Enter other array");
		for(int i = 0; i < 3; i++){
			for (int j = 0; j < 3 ; j++ ) {
				b[i][j] = sc.nextInt();
			}
		}
		System.out.println("addition is ");
		for(int i = 0; i < 3; i++){
			for (int j = 0; j < 3 ; j++ ) {
				System.out.print((a[i][j] + b[i][j])+"\t");
			}
			System.out.println();
		}
	}
}