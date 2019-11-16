package CompanyQuestions;

import java.util.Scanner;

public class greatedamong3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		if(a>b && a>c)
		{
			System.out.print("Greatest number is : "+a);
		}
		else if(b>c && b>a)
		{
			System.out.print("Greatest number is : "+b);
		}
		else
			System.out.print("Greatest number is : "+c);
	}

}
