class ctree {
	public static void main(String[] args) {
		int i, j, k, height = 3, width = 7, r = 1, m = 1;
		int space = width * 4;
		for (r = 1; r <= height; r++) {
			for (i = m; i <= width ; i++) {
				for (j = space; j >= i ; j--) {
					System.out.print(" ");
				}
				for(k = 1; k <= i; k++){
					System.out.print("* ");
				}
				System.out.println();
			}
			m+=4;
			width+=6;
		}
		for (i = 1; i <= 7 ;i++) {
			for (j = space-3; j>=1 ;j--) {
				System.out.print(" ");
			}
			for (k = 1; k <= 4 ; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
} 