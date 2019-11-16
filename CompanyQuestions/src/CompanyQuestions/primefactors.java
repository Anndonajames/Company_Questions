package CompanyQuestions;

import java.util.Scanner;

public class primefactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int flag=0,i;
	for(i=2;i<n;i++)
	{
		if(n%i==0)
		{
			flag=0;
			break;
		}
		else
			System.out.println(i);
	}
	
	}

}
