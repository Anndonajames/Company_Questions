package CompanyQuestions;

import java.util.Scanner;

public class arclengthofcircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the angle : ");
	double angle=s.nextDouble();
	System.out.println("Enter the radius : ");
	double radius=s.nextDouble();
	double pi=3.14;
	double arc_length=2*pi*radius*angle/360;
	System.out.println("Arc length :"+arc_length);
	
	}

}
