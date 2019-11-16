package CompanyQuestions;

import java.util.Scanner;

public class replace_a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string ");
		String str1=s.nextLine();
		
		String str3=str1.replace("a","$");
		System.out.println(str3);
	}

}
