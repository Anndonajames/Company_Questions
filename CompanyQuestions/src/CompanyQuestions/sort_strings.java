package CompanyQuestions;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class sort_strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=s.nextInt();
		int i,j;
		String str[]=new String[n];
		
		for(i=0;i<n;i++)
		{
			str[i]=s.next();
		}
		Arrays.sort(str);
		for(i=0;i<n;i++)
		{
			System.out.println(str[i]);
		}
	
	}

}
