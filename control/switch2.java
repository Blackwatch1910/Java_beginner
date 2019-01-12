import java.util.*;
class switch2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice for vowels and consonants");
		char choice = sc.next().charAt(0);
		switch(choice){
			case 'a':
			System.out.println("Vowel");
			break;
			case 'e':
			System.out.println("Vowel");
			break;
			case 'i':
			System.out.println("Vowel");
			break;
			case 'o':
			System.out.println("Vowel");
			break;
			case 'u':
			System.out.println("Vowel");
			break;
			default:
			System.out.println("Consonant");
		}
	}
}