package CompanyQuestions;

import java.util.Scanner;

public class Strong_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number:");
	int n=s.nextInt();
	int num1=n;
	int i,r,sum=0;
	while(n>0)
	{
		int f=1;
	r=n%10;
	for(i=1;i<=r;i++)
	{
		f=f*i;
	}
	System.out.println(f);
sum=sum+f;
n=n/10;
	}
	if(sum==num1)
	{
	System.out.println("Strong Number");
	}
	else
		System.out.println("Not a Strong Number");
		
}
}