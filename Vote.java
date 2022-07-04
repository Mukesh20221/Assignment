package Day6;
import java.util.Scanner;
public class Vote {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter person's age");
		int age=sc.nextInt();
		sc.close();
		if(age>=18) {
			System.out.println("You are eligible for voteing");
		}
		else {
			System.out.println("You are not eligible for voteing");
		}
	}
}