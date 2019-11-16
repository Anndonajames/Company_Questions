package CompanyQuestions;

import java.util.Scanner;

public class uppercase_vowel_consonant {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a characher :");
		char c=s.next().charAt(0);
		if((c>=65 && c<90) || (c>=97 && c<122) )
		{
			if(Character.isUpperCase(c))
			{
				System.out.println("UpperCase");
			}
			if( c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ||c=='A' || c=='E' || c=='I' || c=='O' || c=='U' )
			{ 
				System.out.print("Vowel");
			}
			else
				System.out.print("Consonant");
		}

	}
}
