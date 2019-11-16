package CompanyQuestions;

import java.util.Scanner;

public class prime_number {
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int i,j;
int flag=0,c=0;
//j=1;
for(i=2;i<n/2;i++)
{
	if(n%i==0)
	{
		System.out.println(i);
		
	}
	else
		System.out.println("prime"+i+" "+i+2);
	//j++;
}


}
}


































/*
 public class prime_number {
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int f=0,c=0;
if(n==0 || n==1)
{
	System.out.println("Not a prime number");
}
for(int i=2;i<=n/2;i++)
{
	if(n%i==0)
	{
		c++;
	}
	
}
if(c==0)
{
	System.out.println(" prime");
}
else
	System.out.println(" not Prime");
}
}*/
