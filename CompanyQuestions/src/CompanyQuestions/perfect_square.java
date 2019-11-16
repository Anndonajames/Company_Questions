package CompanyQuestions;

import java.util.Scanner;
import java.math.*;

public class perfect_square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		double sqr=Math.sqrt(n);
		if(sqr%2==0)
		{
			System.out.println(n+" is a perfect Square");
			
		}
		else
			System.out.println(n+" is a not perfect Square");
		
		
	}

}
