package CompanyQuestions;

import java.util.Scanner;

public class rev_even_pos_words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		String str=s.nextLine();
		int i,count=0;
		for(i=0;i<str.length()-1;i++)
		{
			if(str.charAt(i)==' ' )
			{
				count++;
			}
		}
		
		

		
	}

}
