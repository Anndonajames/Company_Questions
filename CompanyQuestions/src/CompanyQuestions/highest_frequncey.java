package CompanyQuestions;

import java.util.Scanner;

public class highest_frequncey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner s=new Scanner(System.in);
	String str=s.nextLine();
	int l=str.length();
	boolean f=false;
	char c;
	for( c ='a';c<='z';c++)
	{
		f=false;
		for(int i=0;i<l;i++)
		{
			if(str.charAt(i)==c)
			{
				f=true;
				break;
			}
		}
		if(f==false)
		{
			System.out.println(c);
			break;
		}
	}
	
	
	}

}
