package CompanyQuestions;

import java.util.Scanner;

public class change_case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner s=new Scanner(System.in);
	String str=s.nextLine();
	int i;
	String change_Case_upper;
	String change_Case_lower;
	
		change_Case_upper=str.toLowerCase();
		System.out.println(change_Case_upper);
		change_Case_lower=str.toUpperCase();
		System.out.println(change_Case_lower);
	}
	}
