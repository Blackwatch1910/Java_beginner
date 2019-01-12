import java.util.*;
class arr_diag{
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

		for(int i = 0; i < 3; i++){
			for (int j = 0; j < 3 ; j++ ) {
				if(i <= j)
					System.out.print(a[i][j]+"\t");
				else
					System.out.print("\t");
			}
			System.out.println();
		}
	}
}