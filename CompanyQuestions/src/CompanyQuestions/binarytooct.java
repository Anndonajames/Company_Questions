package CompanyQuestions;

import java.util.Scanner;

public class binarytooct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner s=new Scanner(System.in);
	String binary=s.nextLine();
	int binary_num=Integer.parseInt(binary,2);
	String octal=Integer.toOctalString(binary_num);
	System.out.println(octal);
	
	}

}
