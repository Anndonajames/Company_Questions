package CompanyQuestions;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i,f=1;
		for(i=1;i<=n;i++)
		{
			f=f*i;
		}
		System.out.println(f);
	}

}
