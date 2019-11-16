package CompanyQuestions;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int num=n;
	int rev=0,r;
	while(n>0)
	{
		r=n%10;
		rev=rev*10+r;
		n=n/10;
	}
	if(rev==num)
	{
		System.out.println("Palindrome");
	}
	else
		System.out.println("Not Palindrome");	
	
	}

}
