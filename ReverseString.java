import java.util.Scanner;


public class ReverseString {


	
		public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string to reverse ");
			String str= sc.next();
			String nstr="";
			char ch;
		
		System.out.println("Original word: "+str);
		
		
		for (int i=0; i<str.length(); i++)
		{
			ch= str.charAt(i); //extracts each character
			nstr= ch+nstr; //adds each character in front of the existing string
		}
		sc.close();
		System.out.println("Reversed word: "+ nstr);
		}
	}