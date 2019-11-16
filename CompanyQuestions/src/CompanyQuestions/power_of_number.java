package CompanyQuestions;

import java.util.Scanner;
import java.math.*;
public class power_of_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number : ");
	int num=s.nextInt();
	System.out.println("Enter the power value");
	int pow1=s.nextInt();
	double result=Math.pow(num, pow1);
	System.out.println("Result :"+result);
	}
}
