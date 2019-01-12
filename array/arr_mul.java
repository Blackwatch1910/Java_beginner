import java.util.*;
class arr_mul{
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

		int sum = 0;
		int pro[][] = new int [3][3];

		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				sum = 0;
				for(int k = 0; k < 3; k++){
					sum = sum + (a[i][k] * b[k][j]);
				}
				pro[i][j] = sum;
			}
		}
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				System.out.print(pro[i][j]+"\t");
			}
			System.out.println();
		}
	}
}