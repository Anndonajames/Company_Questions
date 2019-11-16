package CompanyQuestions;

import java.util.Scanner;

public class decimal_to_oct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the decimal number");
	int num=s.nextInt();
	String oct=Integer.toOctalString(num);
	System.out.println(oct);
	
	
	}

}
