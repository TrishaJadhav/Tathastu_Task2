import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check if it is palindrome : ");
		int n = sc.nextInt();
		int sum=0,temp=n;
		
		while(n>0) {
			int r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(sum==temp) {
			System.out.println(temp+" is a palindrome number.");
		}
		else {
			System.out.println(temp+" is not a palindrome number.");
			}
		
		sc.close();
	}

}