package CompanyQuestions;

import java.util.Scanner;

public class maxelt_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the size of the array");
int n=s.nextInt();
int i;
int a[]=new int[n];
for(i=0;i<n;i++)
{
	a[i]=s.nextInt();
}
System.out.println("Enter the elements :");
int max=a[0];
for(i=0;i<n;i++)
{
	if(max<a[i])
	{
		max=a[i];
		
	}
}
System.out.println("Maximum element is :"+max);

	}

}
