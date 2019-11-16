package CompanyQuestions;

import java.util.Scanner;

public class vowel_or_consonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner s=new Scanner(System.in);
	System.out.println("Enter a character :");
	char c=s.next().charAt(0);
char ch=Character.toUpperCase(c);
if(ch=='A' || ch=='E' || ch=='I' || ch=='O' ||ch=='U')
{
System.out.println("Vowel");
}
else
	System.out.println("Consonant ");
	}
}
