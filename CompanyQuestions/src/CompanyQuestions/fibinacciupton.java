package CompanyQuestions;

import java.util.Scanner;

public class fibinacciupton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i,a,b,c;
		a=0;
		b=1;
		System.out.println(a);
		 System.out.println(b);
		for(i=2;i<n;i++)
		{
			 c=a+b;
			 System.out.println(c);
			 a=b;
			 b=c;
			 
			 
		}
		
	}

}
