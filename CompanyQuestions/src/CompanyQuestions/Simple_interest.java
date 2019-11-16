package CompanyQuestions;

import java.util.Scanner;

public class Simple_interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner s=new Scanner(System.in);
	System.out.println("Enter the principle amount:");
	int p=s.nextInt();
	System.out.println("Enter the rate :");
	int r=s.nextInt();
	System.out.println("Enter number of years :");
	int yr=s.nextInt();
	double si=p*yr*r/100;
	System.out.println("Simple intrest :"+si);
	
	
	}

}
