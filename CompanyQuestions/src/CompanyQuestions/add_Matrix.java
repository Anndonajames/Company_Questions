package CompanyQuestions;

import java.util.Scanner;

public class add_Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner s=new Scanner(System.in);
	System.out.println("1.Enter the number of rows :");
	int row1=s.nextInt();
	System.out.println("1.Enter the number of columns :");
	int col1=s.nextInt();
	int i,j;
	int arr1[][]=new int [row1][col1];
	System.out.println("2.Enter the number of rows :");
	int row2=s.nextInt();
	System.out.println("2.Enter the number of columns :");
	int col2=s.nextInt();
	int arr2[][]=new int [row2][col2];
	int res[][]=new int [row1][col1];
	if(row1==row2 && col1==col2)
	{
		System.out.println("Enter the Elements :");
	
	for(i=0;i<row1;i++)
	{
		for(j=0;j<col1;j++)
		{
			arr1[i][j]=s.nextInt();
		}
	}
	System.out.println("Enter the Elements :");
	for(i=0;i<row1;i++)
	{
		for(j=0;j<col1;j++)
		{
			arr2[i][j]=s.nextInt();
		}
	}
	
	for(i=0;i<row1;i++)
	{
		for(j=0;j<col1;j++)
		{
			res[i][j]=arr1[i][j]+arr2[i][j];
		}
	}
	}
	System.out.println("Result :");
	for(i=0;i<row1;i++)
	{
		for(j=0;j<col1;j++)
		{
			System.out.print(res[i][j]+" ");
			
		}
		System.out.println("\n");
	}
	}
		
	}

