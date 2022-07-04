package Day6;
import java.util.Scanner;
public class CheckNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int number=sc.nextInt();
		sc.close();
		if(number<0) {
			System.out.println("Given number is negetive");
		}
		else if(number>0) {
			System.out.println("Given number is postive");
		}
		else {
			System.out.println("Given number is zero");
		}
	}
}