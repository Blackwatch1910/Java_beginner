import java.util.*;
class check5{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks in Maths, Science, Computer and English");
		int maths = sc.nextInt();
		int science = sc.nextInt();
		int english = sc.nextInt();
		int comp = sc.nextInt();
		float per = 0.00f;
		per = ((float)(maths + science + english + comp)/4);
		if(per >= 90)
			System.out.println(per+" Distiction");
		else if (per >= 80 && per < 90)
			System.out.println(per+" Good");
		else if (per >= 70 && per < 80)
			System.out.println(per+" Average");
		else if (per >= 50 && per < 70)
			System.out.println(per+" Needs improvement");
		else
			System.out.println(per+" Fail!");
		}
	}
		