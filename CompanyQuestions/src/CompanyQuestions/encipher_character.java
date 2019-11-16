package CompanyQuestions;

import java.util.Scanner;

public class encipher_character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the Character :");
	char ch=s.next().charAt(0);
	int b=s.nextInt();
	int c=(int)ch;
	int d=b+c;
	System.out.println((char)d);
	
	}

}
