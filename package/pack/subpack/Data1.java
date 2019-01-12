package pack.subpack;
import java.util.Scanner;
public class Data1{
	public int a, b;
	Scanner sc = new Scanner(System.in);
	public void mul(){
		System.out.println("Enter values:");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("Multiplication:"+(a*b));
	}
}