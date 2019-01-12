package pack;
import java.util.Scanner;
public class Data{
	public int a, b;
	Scanner sc = new Scanner(System.in);
	public void add(){
		System.out.println("Enter values:");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("Addition:"+(a+b));
	}
}