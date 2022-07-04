package Day6;
import java.util.Scanner;
public class BloodDotation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter person's age");
		int age =sc.nextInt();
		System.out.println("Enter person's weight");
		int weight=sc.nextInt();
		sc.close();
		if((age>25)&&(weight>48)) {
			System.out.println("You can donate blood");
		}
		else {
			System.out.println("You can not donate blood");
		}
	}
}