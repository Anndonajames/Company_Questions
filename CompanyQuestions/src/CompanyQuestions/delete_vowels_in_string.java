package CompanyQuestions;

import java.util.Scanner;

public class delete_vowels_in_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner s=new Scanner(System.in);
	String str=s.nextLine();
	int len=str.length();
	int i;
	str=str.replaceAll("[AEIOUaeiou]","");
	System.out.println(str);
	}

}
