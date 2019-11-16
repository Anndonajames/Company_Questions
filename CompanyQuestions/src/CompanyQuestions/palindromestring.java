package CompanyQuestions;

import java.util.Scanner;

public class palindromestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		int len=str.length();
		//System.out.print(len);
		String rev="";
		int i;
		for(i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		
		if(str.equals(rev))
		{
		System.out.println("palindrome ");
		
		}
		else
			
			System.out.println("not palindrome ");
	}

}
