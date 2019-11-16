package CompanyQuestions;

import java.util.Scanner;

public class smallestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int a[]=new int[n];
	int i,j,temp,small=0;
	
	for(i=0;i<n;i++)
	{
		a[i]=s.nextInt();
		 small=a[0];
		
			if(small>a[i])
			{
			small=a[i];
			}
	}
	System.out.println(small);
	}
	
	}


