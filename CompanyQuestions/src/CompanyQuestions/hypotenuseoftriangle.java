package CompanyQuestions;
import java.math.*;
import java.util.Scanner;

public class hypotenuseoftriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter side 1 : ");
		int side1=s.nextInt();
		System.out.println("Enter side 2 : ");
		int side2=s.nextInt();
		
		int hyp=(side1*side1)+(side2*side2);
		double sq=Math.sqrt(hyp);
		//double sq1=Math.ceil(sq);
		System.out.println("Hypotenuse of triangle is"+sq);
		
		
	}

}
