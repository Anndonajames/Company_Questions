package CompanyQuestions;

import java.util.Scanner;

public class lengthof_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		int count=0;
		char ch[]=str.toCharArray();
		for(char c:ch)
		{
			count++;
		}
		
		System.out.println(count);
	}

}
