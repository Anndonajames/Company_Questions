package CompanyQuestions;

import java.util.Scanner;

public class searchelt_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the size of the array :");
	int n=s.nextInt();
	int a[]=new int[n];
	int i,flag=0;
	for(i=0;i<n;i++)
	{
		a[i]=s.nextInt();
	}
	System.out.println("Enter the element to search :");
	int elt=s.nextInt();
	for(i=0;i<n;i++)
	{
		if(a[i]==elt)
		{
			flag=1;
			break;
		}
	}
	System.out.println("Element "+elt+" is founded at position "+(i+1));
	}

}
