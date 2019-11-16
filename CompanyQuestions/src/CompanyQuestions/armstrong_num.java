package CompanyQuestions;

import java.util.Scanner;

public class armstrong_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int num=n;
		int arm=0,r;
		while(n>0)
		{
			r=n%10;
			arm=arm+(r*r*r);
			n=n/10;
		}
		if(arm==num)
		{
		System.out.println("Armstrong number");
		}
		else
			System.out.println("Not an armstrong number");
		
	}

}
