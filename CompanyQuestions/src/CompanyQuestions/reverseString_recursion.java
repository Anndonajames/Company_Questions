package CompanyQuestions;

import java.util.Scanner;

public class reverseString_recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		 
		        String str = s.nextLine();
		        String reversed = reverseString(str);
		        System.out.println("The reversed string is: " + reversed);
		    }

		    public static String reverseString(String str)
		    {
		        if (str.isEmpty())
		            return str;
		        
		        return reverseString(str.substring(1)) + str.charAt(0);
		    }
		
		
	}
