package CompanyQuestions;

import java.util.Scanner;

public class add_two_elts_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the array size 1 :");
	int n1=s.nextInt();
	System.out.println("Enter the array size 2:");
	
	int n2=s.nextInt();
	int a[]=new int[n1];
	int b[]=new int[n2];
	int i,j,num1=0,num2=0,sum=0;
	System.out.println("Enter the Elemetns :");
	
	for(i=0;i<n1;i++)
	{
		a[i]=s.nextInt();
	}
	System.out.println("Enter the elements ");
	
	for(j=0;j<n2;j++)
	{
		b[j]=s.nextInt();
	}
	System.out.println("Enter the index 1 ");
	int index1=s.nextInt();
	System.out.println("Enter the index 1 ");
	int index2=s.nextInt();
	if(index1<=n1)
	{
		num1=a[index1-1];
	}
	if(index2<=n2)
	{
		num2=b[index2-1];
	}
	sum=num1+num2;
	System.out.println("Sum of elements is : "+sum);
	
	}
	
	
	
	}


