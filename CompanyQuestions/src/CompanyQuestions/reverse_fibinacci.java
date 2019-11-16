package CompanyQuestions;

import java.util.Scanner;

public class reverse_fibinacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int flag=0,i;
		int a[]=new int[n];
		a[0]=0;
		a[1]=1;
		for(i=2;i<n;i++)
		{
			a[i]=a[i-2]+a[i-1];
		}
		for(i=n-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
	}

}
