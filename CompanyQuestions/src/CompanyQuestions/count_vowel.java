package CompanyQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class count_vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String :");
		int i,j;
		String str=s.next();;
		int len=str.length();
		int count=0;
		for(i=0;i<len;i++)
		{
			if( str.charAt(i)=='a' ||str.charAt(i)=='e' || str.charAt(i)=='i' ||
					str.charAt(i)=='o' || str.charAt(i)=='u' ||str.charAt(i)=='A'
					|| str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' ||str.charAt(i)=='U' )
			{
				count++;
			}
		}
		System.out.println(count);
				
		}
	
	}

