import java.util.*;
class truth_table{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the bits");
		int bit = sc.nextInt();
		int numRows = (int)Math.pow(2,3);
		boolean bools[][] = new boolean[numRows][bit];
		int tab[][] = new int[numRows][bit];
		for(int i = 0; i < bools.length; i++){
			for(int j = 0; j < bools[i].length; j++){
    	        int val = bools.length * j + i;
        	    int ret = (1 & (val >>> j));
        	    bools[i][j] = ret != 0;
        	    tab[i][j] = bools[i][j]?1:0;
        	    //System.out.print((bools[i][j]?1:0) + "\t");
	        }
	    }
	    for(int i = 0; i < bools.length; i++){
			for(int j = 0; j < bools[i].length; j++)	
    			System.out.print(tab[i][j] + "\t");    
        System.out.println();
    	}
    	System.out.println("*************************************");
    	for(int i = 0; i < bools.length; i++){
			for(int j = 0; j < bools[i].length-1; j++){
    			if(tab[i][j] == 1 && tab[i][j+1] == 1)
    				continue;
    			else{
    				System.out.print(tab[i][j]+"\t");
    			}
			}
			System.out.println();		
		}
	}
}