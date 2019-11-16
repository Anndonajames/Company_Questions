package CompanyQuestions;

import java.util.Scanner;

public class replace_with_subString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string ");
		String str1=s.nextLine();
		System.out.println("Enter the sub string to replace ");
		String str2=s.nextLine();
		String str3=str1.replace(str1,str2);
		System.out.println(str3);
		
		
	}

}
